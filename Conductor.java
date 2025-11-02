public class Conductor {
    private String nombre;
    private String licencia;

    // Constructor con caracteristicas
    public Conductor(String nombre, String licencia) {
        this.nombre = nombre;
        this.licencia = licencia;
    }

    // Constructor vacio
    public Conductor() {
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getLicencia() {
        return licencia;
    }
    // Setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }

    // METODOS
    public boolean buscarNombre(String nombreBuscar) {
        return this.nombre != null && this.nombre.equals(nombreBuscar);
    }

    public boolean buscarLicencia (String licenciaBuscar){
        return this.licencia != null && this.licencia.equals(licenciaBuscar);
    }
    // To String
    @Override
    public String toString() {
        return "Conductor [nombre = " + getNombre() + ", licencia =" + getLicencia() + "]";
    }

    public static boolean contains(String nombreElim) {
        return nombreElim != null && !nombreElim.trim().isEmpty();
    }
    

}