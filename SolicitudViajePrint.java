import java.util.Scanner;

public class SolicitudViajePrint {
    Scanner entrada = new Scanner(System.in);
    EmpresaTransporte empresa = new EmpresaTransporte();

    public void agregarSolicitudPrint() {
        System.out.println("\nDame el nombre del cliente: ");
        String nombreCliente = entrada.nextLine();
        System.out.println("\nDame el destino del viaje: ");
        String destinoViaje = entrada.nextLine();
        System.out.println("\nDame el tipo de vehículo requerido (Taxi, Camión o Autobús): ");
        String tipoVehiculo = entrada.nextLine();

        SolicitudViaje solicitud = new SolicitudViaje(nombreCliente, destinoViaje, tipoVehiculo);
        empresa.agregarSolicitud(solicitud);
    }

    public void atenderSolicitudPrint() {
        empresa.atenderSolicitud();
    }

    public void mostrarSolicitudesPendientesPrint() {
        empresa.mostrarSolicitudesPendientes();
    }

    public void mainSolicitudes() {
        String opcion;

        while (true) {
            System.out.println("\nSolicitud de viajes📝");
            System.out.println("1. Registrar nueva solicitud de viaje");
            System.out.println("2. Atender siguiente solicitud de viaje");
            System.out.println("3. Mostrar solicitudes pendientes");
            System.out.println("0. Regresar al menú anterior");

            while (true) {
                System.out.println("\nSeleccione una opción: ");
                opcion = entrada.nextLine();

                if (!opcion.equals("1") && !opcion.equals("2") && !opcion.equals("3") && !opcion.equals("0")) {
                    System.out.println("Debe ser un número entre 0 y 3");
                    continue;
                } else {
                    break;
                }
            }

            switch (opcion) {
                case "1":
                    agregarSolicitudPrint();
                    break;
                case "2":
                    atenderSolicitudPrint();
                    break;
                case "3":
                    mostrarSolicitudesPendientesPrint();
                    break;
                case "0":
                    return;
            }
        }
    }
}
