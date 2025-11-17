import java.util.List;
import java.util.Scanner;

public class VehiculoMAPPrint {
    private EmpresaTransporte empresa;
    private Scanner entrada = new Scanner(System.in);

    public VehiculoMAPPrint(EmpresaTransporte empresa) {
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
        empresa.registrarVehiculoMAP(v);
    }

    private void buscarPorPlaca() {
        System.out.print("\nIngrese placa del vehículo a buscar: ");
        String placaBuscar = entrada.nextLine();
        System.out.println(empresa.buscarVehiculoMAP(placaBuscar));

    }

    private void eliminarPorPlaca() {
        System.out.print("\nIngrese la placa que quiere eliminar: ");
        String placa = entrada.nextLine();
        empresa.eliminarVehiculoMAP(placa);

    }

    private void listarVehiculos() {
        empresa.mostrarVehiculosMAP();
    }

    public void mainVehiculos() {
        String opcion;
        while (true) {
            System.out.println("\n--- Gestión de Vehiculos ---");
            System.out.println("1. Registrar vehículo");
            System.out.println("2. Buscar vehículo por placa");
            System.out.println("3. Eliminar vehículo por placa");
            System.out.println("4. Listar vehículos");
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
                case "0":
                    return;
                default:
                    System.out.println("Opción inválida. Intenta otra vez.");
            }
        }
    }
}
