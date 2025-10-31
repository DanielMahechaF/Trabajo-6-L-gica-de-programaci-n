import java.util.List;
import java.util.Stack;
import java.util.ArrayList;

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
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.buscarPlaca(placaBuscar)) {
                if (vehiculo.getPlaca().toLowerCase().contains(placaBuscar.toLowerCase())) {
                    resultados.add(vehiculo);
                }
            }
        }
        return resultados;
    }

    public List<Conductor> buscarConductorNombre(String nombreBuscar) {
        List<Conductor> resultados = new ArrayList<>();
        for (Conductor conductor : conductores) {
            if (conductor.buscarNombre(nombreBuscar)) {
                if (conductor.getNombre().toLowerCase().contains(nombreBuscar.toLowerCase())) {
                    resultados.add(conductor);
                }
            }
        }
        return resultados;
    }

    public List<Vehiculo> eliminarVehiculoPlaca(String placaBuscar) {
        List<Vehiculo> resultados = new ArrayList<>();
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.buscarPlaca(placaBuscar)) {
                if (vehiculo.getPlaca().toLowerCase().contains(placaBuscar.toLowerCase())) {
                    resultados.remove(vehiculo);
                }
            }
        }
        return resultados;
    }

    public List<Conductor> eliminarConductorNombre(String nombreBuscar) {
        List<Conductor> resultados = new ArrayList<>();
        for (Conductor conductor : conductores) {
            if (conductor.buscarNombre(nombreBuscar)) {
                if (conductor.getNombre().toLowerCase().contains(nombreBuscar.toLowerCase())) {
                    resultados.remove(conductor);
                }
            }
        }
        return resultados;
    }

    public List<Vehiculo> listarCapacidadMinimo(int capacidadMinima) {
        List<Vehiculo> resultados = new ArrayList<>();
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getCapacidad() >= capacidadMinima) {
                resultados.add(vehiculo);
            }
        }
        return resultados;
    }

    public List<Vehiculo> listarModelo(int modelo) {
        List<Vehiculo> resultados = new ArrayList<>();
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getCapacidad() >= modelo) {
                resultados.add(vehiculo);
            }
        }
        return resultados;
    }

    public int totalVehiculos() {
        int contadorVehiculos = 0;
        for (Vehiculo vehiculo : vehiculos) {
            contadorVehiculos += 1;
        }
        return contadorVehiculos;
    }

    public double promedioCapacidad() {
        int contadorCapacidad = 0;
        for (Vehiculo vehiculo : vehiculos) {
            contadorCapacidad += vehiculo.getCapacidad();
        }
        double promedio = contadorCapacidad / totalVehiculos();
        return promedio;
    }

    // METODOS VIAJE

    public void registrarViaje(Viaje viaje) {
        historialViajes.push(viaje);
        System.out.println("Viaje creado");
    }

    public void verUltimoViaje() {
        System.out.println(historialViajes.peek());
    }

    public void deshacerUltimoViaje() {
        System.out.println(historialViajes.pop());
    }

    public void mostrarHistorial() {
        for (Viaje viaje : historialViajes) {
            System.out.println(viaje);
        }
    }

}
