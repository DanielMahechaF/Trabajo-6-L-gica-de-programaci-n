public class Viaje {
    private String destino;
    private String conductor;
    private String vehiculo;
    private double kilometros;

    // Constructores
    public Viaje() {

    }

    public Viaje(String destino, String conductor, String vehiculo, double kilometros) {
        this.destino = destino;
        this.conductor = conductor;
        this.vehiculo = vehiculo;
        this.kilometros = kilometros;
    }

    // Getters setters
    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getConductor() {
        return conductor;
    }

    public void setConductor(String conductor) {
        this.conductor = conductor;
    }

    public String getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }

    public double getKilometros() {
        return kilometros;
    }

    public void setKilometros(double kilometros) {
        this.kilometros = kilometros;
    }

    @Override
    public String toString() {
        return "Viaje [ destino= " + getDestino() + ", conductor= " + getConductor() + ", vehiculo= " + getVehiculo()
                + ", kilometros= " + getKilometros() + " ]";
    }
}
