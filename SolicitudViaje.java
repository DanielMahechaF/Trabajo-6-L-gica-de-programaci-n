public class SolicitudViaje {
    private String cliente;
    private String destino;
    private String tipoVehiculo;

    // Constructor
    public SolicitudViaje() {

    }

    public SolicitudViaje(String cliente, String destino, String tipoVehiculo) {
        this.cliente = cliente;
        this.destino = destino;
        this.tipoVehiculo = tipoVehiculo;
    }

    // Getters y Setters
    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    // TO STRING
    @Override
    public String toString() {
        return "Cliente: " + getCliente() + "\nDestino: " + getDestino() + "\nTipo de Vehiculo: "
                + getTipoVehiculo();
    }
}
