import java.util.List;
import java.util.Scanner;

public class ConductorPrint {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String entrada;
        String placa;
        int modelo;
        int capacidad; 
        String nombre;
        String licencia;
        String opcion;
        String nombreElim;
        String placaElim;
        EmpresaTransporte empresa = new EmpresaTransporte();

        while (true) {
            System.out.println("---Bienvenido Mosqueteros BusCompany ---");
            System.out.println("Opciones: ");
            System.out.println("| 1 | Registrar Vehiculo");
            System.out.println("| 2 | Registar Conductor");
            System.out.println("| 3 | Mostrar lista de vehiculos y conductores ");
            System.out.println("| 4 | Eliminar por placa o por nombre ");
            System.out.println("| 0 | Salir");
            System.out.print("Seleccione una opción: ");
            entrada = scanner.nextLine().trim().toLowerCase();

            switch (entrada) {
                case "1":
                    System.out.println(" Ingresa la placa del vehiculo ");
                    placa = scanner.nextLine().trim();
                    System.out.println(" Ingresa el modelo del vehiculo ");
                    modelo = Integer.parseInt(scanner.nextLine().trim());
                    System.out.println(" Ingrese la capacidad del vehiculo ");
                    capacidad = Integer.parseInt(scanner.nextLine().trim());
                    Vehiculo vehiculo = new Vehiculo(placa,String.valueOf(modelo), capacidad);
                    empresa.registrarVehiculo(vehiculo);
                    System.out.println("Vehiculo registrado con la plac : " + placa);
                    break;
                case "2":
                    System.out.println(" Ingrese el nombre del conductor a registrar ");
                    nombre = scanner.nextLine().trim();
                    System.out.println(" Ingrese la licencia del conductor ");
                    licencia = scanner.nextLine().trim();
                    Conductor conductor = new Conductor(nombre,licencia);
                    empresa.registrarConductor(conductor);
                    System.out.println("Se ha registardo el conductor con nombre " + nombre);
                    break;
                case "3":
                    System.out.println("--- Lista Actual vehiculos ---");
                    List<Vehiculo> listaVehiculos = empresa.getVehiculos();
                    if (listaVehiculos == null || listaVehiculos.isEmpty()){
                        System.out.println("La lista esta vacia!!");
                    }else{
                        System.out.println("--- Vehiculos existentes ---");
                        for (Vehiculo i : listaVehiculos) {
                            System.out.println(i);
                        }
                        System.out.println("Total vehiculos : " + listaVehiculos.size());
                    }
                    System.out.println("--- Lista Actual de conductores ---");
                    List<Conductor> listaConductores = empresa.getConductores();
                    if (listaConductores == null || listaConductores.isEmpty()){
                        System.out.println("La lista esta vacia!!");
                    }else{
                        System.out.println("--- Conductores existentes ---");
                        for (Conductor i : listaConductores) {
                            System.out.println(i);
                        }
                        System.out.println("Total conductores : " + listaConductores.size());
                    }
                    break;
                case "4":
                    System.out.println("Seleccione: Nombre o Placa");
                    opcion = scanner.nextLine().trim().toLowerCase();
                    if (opcion.equals("nombre")){
                        System.out.println("Ingrese el nombre a eliminar: ");
                        nombreElim = scanner.nextLine().trim().toLowerCase();
                        if (Conductor.contains(nombreElim)){
                            List<Conductor> eliminados = empresa.eliminarConductorNombre(nombreElim);
                            if(eliminados == null || eliminados.isEmpty()){
                                System.out.println("Nombre no encontrado ");
                            }else{
                                System.out.println("Se eliminaron :" + eliminados.size() + "Conductores:");
                                for (Conductor i : eliminados) {
                                    System.out.println(i);
                                }
                            }
                        }else{
                            System.out.println("Nombre vacio ");
                        }
                    }else if(opcion.equals("placa")){
                        System.out.println("Ingrese la placa a eliminar");
                        placaElim = scanner.nextLine().trim().toLowerCase();
                        List<Vehiculo> vehiculoEliminado = empresa.eliminarVehiculoPlaca(placaElim);
                        if(vehiculoEliminado == null || vehiculoEliminado.isEmpty()){
                            System.out.println("Placa no encontrada");

                        }else{
                             System.out.println("Se eliminaron :" + vehiculoEliminado.size() + "Vehiculos ");
                                for (Vehiculo i : vehiculoEliminado) {
                                    System.out.println(i);
                                }
                        }
                    }else{
                        System.out.println("Opcion invalida");
                    }
                    break;
                case "5":
                    
                    break;

                case "0":
                    System.out.println("Saliendo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        }
    }
    



}
