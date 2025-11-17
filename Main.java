import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        ViajePrint printViajes = new ViajePrint();
        ConductorPrint printConductores = new ConductorPrint(printViajes.empresa);
        VehiculoPrint printVehiculos = new VehiculoPrint(printViajes.empresa);
        SolicitudViajePrint printSolicitudes = new SolicitudViajePrint();
        VehiculoMAPPrint printVehiculosMAP = new VehiculoMAPPrint(printViajes.empresa);

        while (true) {
            System.out.println("\nEmpresa de transporte TransUnisalle🚙🚗🚕🚚");
            System.out.println("\n---✨Bienvenido al menu principal✨---\n ");
            System.out.println("1.Gestionar conductores");
            System.out.println("2.Gestionar vehiculos");
            System.out.println("3.Gestionar vehiculos con MAP");
            System.out.println("4.Gestionar viajes");
            System.out.println("5.Solicitar viajes");
            System.out.println("0.Salir");

            String opcion;

            while (true) {
                System.out.println("\nSeleccione una opción: ");
                opcion = entrada.nextLine();
                if (!opcion.equals("1") && !opcion.equals("2") && !opcion.equals("3") && !opcion.equals("4")
                        && !opcion.equals("5")
                        && !opcion.equals("0")) {
                    System.out.println("Debe ser un número entre 0 y 4");
                    continue;
                } else {
                    break;
                }
            }

            switch (opcion) {
                case "1":
                    printConductores.mainConductores();
                    break;
                case "2":
                    printVehiculos.mainVehiculos();
                    break;
                case "3":
                    printVehiculosMAP.mainVehiculos();
                    break;
                case "4":
                    printViajes.mainViajes();
                    break;
                case "5":
                    printSolicitudes.mainSolicitudes();
                    break;
                case "0":
                    System.out.println("\nHasta luego!\n");
                    return;
            }

        }

    }

}