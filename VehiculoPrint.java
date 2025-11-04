import java.util.List;
import java.util.Scanner;

//CLASE BY MARIA PAULA RAMIREZ

public class VehiculoPrint {
    private EmpresaTransporte empresa;
    private Scanner entrada = new Scanner(System.in);

    public VehiculoPrint(EmpresaTransporte empresa) {
        this.empresa = empresa;
    }

    private void registrarVehiculo() {
        System.out.println("\nRegistrar vehiculo");
        System.out.print("Ingrese placa del vehículo: ");
        String placa = entrada.nextLine();
        System.out.print("Ingrese modelo del vehículo (año): ");
        int modelo = entrada.nextInt();
        System.out.print("Ingrese capacidad del vehículo: ");
        int capacidad = entrada.nextInt();
        entrada.nextLine();
        Vehiculo v = new Vehiculo(placa, modelo, capacidad);
        empresa.registrarVehiculo(v);
    }

    private void listarVehiculos() {
        List<Vehiculo> lista = empresa.getVehiculos();
        if (lista.isEmpty()) {
            System.out.println("\nNo hay vehiculos registrados.");
            return;
        }
        System.out.println("\nLista de conductores:");
        for (Vehiculo vehiculo : lista)
            System.out.println(vehiculo);
    }

    private void buscarPorPlaca() {
        System.out.print("\nIngrese placa del vehículo a buscar: ");
        String placaBuscar = entrada.nextLine();
        List<Vehiculo> vehiculosEncontrados = empresa.buscarVehiculoPlaca(placaBuscar);
        if (vehiculosEncontrados.isEmpty()) {
            System.out.println("\nNo se encontró ningún vehículo con esa placa.");
        } else {
            System.out.println("\nVehículos encontrados:");
            for (Vehiculo veh : vehiculosEncontrados) {
                System.out.println(veh);
            }
        }
    }

    private void eliminarPorPlaca() {
        System.out.print("\nIngrese la placa que quiere eliminar: ");
        String placa = entrada.nextLine();
        List<Vehiculo> eliminados = empresa.eliminarVehiculoPlaca(placa);
        if (eliminados.isEmpty())
            System.out.println("\nNo se eliminó ningún vehiculo.");
        else {
            System.out.println("\nVehiculos eliminados:");
            for (Vehiculo vehiculo : eliminados)
                System.out.println(vehiculo);
        }
    }

    private void listarCapacidadMinima() {
        System.out.print("\nIngrese capacidad mínima: ");
        int capacidadMin = entrada.nextInt();
        entrada.nextLine(); // limpiar buffer
        List<Vehiculo> porCapacidad = empresa.listarPorCapacidadMinima(capacidadMin);
        if (porCapacidad.isEmpty()) {
            System.out.println("\nNo hay vehículos con esa capacidad mínima.");
        } else {
            System.out.println("\nVehículos con capacidad >= " + capacidadMin + ":");
            for (Vehiculo veh : porCapacidad) {
                System.out.println(veh);
            }
        }
    }

    private void listarModelo() {
        System.out.print("\nIngrese modelo del vehículo (año): ");
        int modeloBuscar = entrada.nextInt();
        entrada.nextLine(); // limpiar buffer
        List<Vehiculo> porModelo = empresa.listarPorModelo(modeloBuscar);
        if (porModelo.isEmpty()) {
            System.out.println("\nNo hay vehículos de ese modelo.");
        } else {
            System.out.println("\nVehículos del modelo " + modeloBuscar + ":");
            for (Vehiculo veh : porModelo) {
                System.out.println(veh);
            }
        }
    }

    public void mostrarEstadisticasVehiculos() {
        System.out.println("\n📊 ESTADÍSTICAS DE VEHÍCULOS:");
        System.out.println("Total de vehículos registrados: " + empresa.totalVehiculos());
        System.out.printf("Promedio de capacidad: %.2f\n", empresa.promedioCapacidad());
    }

    public void mainVehiculos() {
        String opcion;
        while (true) {
            System.out.println("\n--- Gestión de Vehiculos ---");
            System.out.println("1. Registrar vehículo");
            System.out.println("2. Buscar vehículo por placa");
            System.out.println("3. Eliminar vehículo por placa");
            System.out.println("4. Listar vehículos");
            System.out.println("5. Listar vehículos por capacidad mínima");
            System.out.println("6. Listar vehículos por modelo");
            System.out.println("7. Mostrar estadísticas (total y promedio capacidad)");

            System.out.println("0. Volver al menú principal");

            System.out.print("\nSeleccione opción: ");
            opcion = entrada.nextLine();

            switch (opcion) {
                case "1":
                    registrarVehiculo();
                    break;
                case "2":
                    buscarPorPlaca();
                    break;
                case "3":
                    eliminarPorPlaca();
                    break;
                case "4":
                    listarVehiculos();
                    break;
                case "5":
                    listarCapacidadMinima();
                    break;
                case "6":
                    listarModelo();
                    break;
                case "7":
                    mostrarEstadisticasVehiculos();
                    break;
                case "0":
                    return;
                default:
                    System.out.println("Opción inválida. Intenta otra vez.");
            }
        }
    }
}
