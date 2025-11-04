import java.util.List;
import java.util.Stack;
import java.util.ArrayList;
import java.util.Iterator;

public class EmpresaTransporte {
    // Listas - atributos
    private List<Vehiculo> vehiculos;
    private List<Conductor> conductores;

    // Pila de viajes
    private Stack<Viaje> historialViajes = new Stack<>();

    // Constructor
    public EmpresaTransporte() {
        this.vehiculos = new ArrayList<>();
        this.conductores = new ArrayList<>();
    }

    // METODOS

    // Agregacion de vehgiculos al Array
    public void registrarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
        System.out.println("Vehiculo creado");
    }

    public void registrarConductor(Conductor conductor) {
        conductores.add(conductor);
        System.out.println("Conductor creado");
    }

    public List<Vehiculo> buscarVehiculoPlaca(String placaBuscar) {
        List<Vehiculo> resultados = new ArrayList<>();
        if (placaBuscar == null)
            return resultados;
        String target = placaBuscar.toLowerCase();
        for (Vehiculo vehiculo : vehiculos) {
            String placa = vehiculo.getPlaca();
            if (placa != null && placa.toLowerCase().contains(target)) {
                resultados.add(vehiculo);
            }
        }
        return resultados;
    }

    public List<Conductor> buscarConductorNombre(String nombreBuscar) {
        List<Conductor> resultados = new ArrayList<>();
        if (nombreBuscar == null)
            return resultados;
        String target = nombreBuscar.toLowerCase();
        for (Conductor conductor : conductores) {
            String nombre = conductor.getNombre();
            if (nombre != null && nombre.toLowerCase().contains(target)) {
                resultados.add(conductor);
            }
        }
        return resultados;
    }

    public List<Vehiculo> eliminarVehiculoPlaca(String placaBuscar) {
        List<Vehiculo> eliminados = new ArrayList<>();
        if (placaBuscar == null)
            return eliminados;
        String target = placaBuscar.toLowerCase();
        Iterator<Vehiculo> it = vehiculos.iterator();
        while (it.hasNext()) {
            Vehiculo v = it.next();
            String placa = v.getPlaca();
            if (placa != null && placa.toLowerCase().contains(target)) {
                eliminados.add(v);
                it.remove();
            }
        }
        return eliminados;
    }

    public List<Conductor> eliminarConductorNombre(String nombreBuscar) {
        List<Conductor> eliminados = new ArrayList<>();
        if (nombreBuscar == null)
            return eliminados;
        String target = nombreBuscar.toLowerCase();
        Iterator<Conductor> it = conductores.iterator();
        while (it.hasNext()) {
            Conductor c = it.next();
            String nombre = c.getNombre();
            if (nombre != null && nombre.toLowerCase().contains(target)) {
                eliminados.add(c);
                it.remove();
            }
        }
        return eliminados;
    }

    public List<Vehiculo> listarPorModelo(int modeloBuscar) {
        List<Vehiculo> resultados = new ArrayList<>();
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getModelo() == modeloBuscar)
                resultados.add(vehiculo);
        }
        return resultados;
    }

    public List<Vehiculo> listarPorCapacidadMinima(int capacidadMinima) {
        List<Vehiculo> resultados = new ArrayList<>();
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getCapacidad() >= capacidadMinima)
                resultados.add(vehiculo);
        }
        return resultados;
    }

    public int totalVehiculos() {
        return vehiculos.size();
    }

    public double promedioCapacidad() {
        if (vehiculos.isEmpty())
            return 0.0;
        int suma = 0;
        for (Vehiculo v : vehiculos)
            suma += v.getCapacidad();
        return (double) suma / vehiculos.size();
    }

    // Metodos para mostrar listas
    public List<Vehiculo> getVehiculos() {
        return new ArrayList<>(vehiculos);
    }

    public List<Conductor> getConductores() {
        return new ArrayList<>(conductores);
    }

    // METODOS VIAJE

    public void registrarViaje(Viaje viaje) {
        historialViajes.push(viaje);
        System.out.println("Viaje creado");
    }

    public void verUltimoViaje() {
        if (historialViajes.isEmpty()) {
            System.out.println("No hay viajes!");
        } else {
            System.out.println(historialViajes.peek().toString());
        }
    }

    public void deshacerUltimoViaje() {
        if (historialViajes.isEmpty()) {
            System.out.println("No hay viajes!");
        } else {
            System.out.println(historialViajes.pop().toString());
            System.out.println("Último viaje eliminado! ");
        }
    }

    public void mostrarHistorial() {
        if (historialViajes.isEmpty()) {
            System.out.println("No hay viajes!");
        } else {
            for (Viaje viaje : historialViajes) {
                System.out.println(viaje.toString());
            }
        }
    }

}
