import java.util.List;
import java.util.Scanner;

//CLASE BY DANIEL MAHECHA
public class ConductorPrint {
    private EmpresaTransporte empresa;
    private Scanner entrada = new Scanner(System.in);

    public ConductorPrint(EmpresaTransporte empresa) {
        this.empresa = empresa;
    }

    private void registrarConductor() {
        System.out.println("\nRegistrar conductor");
        System.out.print("Nombre: ");
        String nombre = entrada.nextLine();
        System.out.print("Licencia: ");
        String licencia = entrada.nextLine();

        Conductor c = new Conductor(nombre, licencia);
        empresa.registrarConductor(c);
    }

    private void listarConductores() {
        List<Conductor> lista = empresa.getConductores();
        if (lista.isEmpty()) {
            System.out.println("\nNo hay conductores registrados.");
            return;
        }
        System.out.println("\nLista de conductores:");
        for (Conductor c : lista)
            System.out.println(c);
    }

    private void buscarPorNombre() {
        System.out.print("\nIngrese nombre o parte del nombre: ");
        String nombre = entrada.nextLine();
        List<Conductor> encontrados = empresa.buscarConductorNombre(nombre);
        if (encontrados.isEmpty())
            System.out.println("\nNo se encontraron conductores.");
        else {
            System.out.println("\nResultados:");
            for (Conductor c : encontrados)
                System.out.println(c);
        }
    }

    private void eliminarPorNombre() {
        System.out.print("\nIngrese nombre o parte del nombre a eliminar: ");
        String nombre = entrada.nextLine();
        List<Conductor> eliminados = empresa.eliminarConductorNombre(nombre);
        if (eliminados.isEmpty())
            System.out.println("\nNo se eliminó ningún conductor.");
        else {
            System.out.println("\nConductores eliminados:");
            for (Conductor c : eliminados)
                System.out.println(c);
        }
    }

    public void mainConductores() {
        String opcion;
        while (true) {
            System.out.println("\n--- Gestión de Conductores ---");
            System.out.println("1. Registrar conductor");
            System.out.println("2. Listar conductores");
            System.out.println("3. Buscar conductor por nombre");
            System.out.println("4. Eliminar conductor por nombre");
            System.out.println("0. Volver al menú principal");

            System.out.print("Seleccione opción: ");
            opcion = entrada.nextLine();

            switch (opcion) {
                case "1":
                    registrarConductor();
                    break;
                case "2":
                    listarConductores();
                    break;
                case "3":
                    buscarPorNombre();
                    break;
                case "4":
                    eliminarPorNombre();
                    break;
                case "0":
                    return;
                default:
                    System.out.println("Opción inválida. Intenta otra vez.");
            }
        }
    }
}
