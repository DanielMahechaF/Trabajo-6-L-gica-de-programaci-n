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
        return this.nombre == nombreBuscar;
    }

}
