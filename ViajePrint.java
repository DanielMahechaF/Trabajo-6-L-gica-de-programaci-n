import java.util.List;
import java.util.Scanner;

//CLASE BY KATHERYNN GOMEZ

public class ViajePrint {
    EmpresaTransporte empresa = new EmpresaTransporte();
    Scanner entrada = new Scanner(System.in);

    public void registrarViajePrint() {
        System.out.println("\nDame el destino a recorrer: ");
        String destino = entrada.nextLine();

        System.out.println("\nDame los kilometros a recorrer: ");
        double kilometros = entrada.nextDouble();
        entrada.nextLine();

        String nombreConductor = null;
        String placaVehiculo = null;

        while (true) {
            System.out.println("Deme el nombre del conductor que desea elegir: ");
            String nombre = entrada.nextLine();

            List<Conductor> conductoresEncontrados = empresa.buscarConductorNombre(nombre);

            if (conductoresEncontrados.isEmpty()) {
                System.out.println("No se encontró ningún conductor con ese nombre.");
                continue;
            } else {
                nombreConductor = conductoresEncontrados.get(0).getNombre();
                break;
            }
        }

        while (true) {
            System.out.println("Deme la placa del vehiculo que desea elegir: ");

            String placa = entrada.nextLine();

            List<Vehiculo> vehiculosEncontrados = empresa.buscarVehiculoPlaca(placa);

            if (vehiculosEncontrados.isEmpty()) {
                System.out.println("\nNo se encontró ninguna vehiculo con esa placa.");
                continue;
            } else {
                placaVehiculo = vehiculosEncontrados.get(0).getPlaca();
                break;
            }
        }

        Viaje viaje = new Viaje(destino, nombreConductor, placaVehiculo, kilometros);

        empresa.registrarViaje(viaje);

        System.out
                .println("\nViaje asignado con éxito para el conductor: " + nombreConductor + " con el vehiculo placa: "
                        + placaVehiculo);
    }

    public void verUltimoViajePrint() {
        System.out.println("\nEl último viaje que hay asignado es: ");
        empresa.verUltimoViaje();
    }

    public void deshacerUltimoViajePrint() {
        System.out.println("\nRevisando último viaje...");
        empresa.deshacerUltimoViaje();
    }

    public void mostrarHistorialPrint() {
        System.out.println("\nHistorial de viajes: ");
        empresa.mostrarHistorial();
    }

    public void mainViajes() {
        String opcion;

        while (true) {
            System.out.println("\nViajes📝");
            System.out.println("1. Registrar viajes");
            System.out.println("2. Ver último viaje");
            System.out.println("3. Borrar último viaje");
            System.out.println("4. Mostrar viajes");
            System.out.println("0. Regresar al menú anterior");

            while (true) {
                System.out.println("\nSeleccione una opción: ");
                opcion = entrada.nextLine();

                if (!opcion.equals("1") && !opcion.equals("2") && !opcion.equals("3") &&
                        !opcion.equals("4") && !opcion.equals("0")) {
                    System.out.println("Debe ser un número entre 0 y 4");
                    continue;
                } else {
                    break;
                }
            }

            switch (opcion) {
                case "1":
                    registrarViajePrint();
                    break;
                case "2":
                    verUltimoViajePrint();
                    break;
                case "3":
                    deshacerUltimoViajePrint();
                    break;
                case "4":
                    mostrarHistorialPrint();
                    break;
                case "0":
                    return;
            }
        }
    }

}
