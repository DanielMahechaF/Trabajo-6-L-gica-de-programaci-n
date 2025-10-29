public class Vehiculo {
    public String placa;
    public String modelo;
    public int capacidad;

    // Constructor
    public Vehiculo(String placa, String modelo, int capacidad) {
        this.placa = placa;
        this.modelo = modelo;
        this.capacidad = capacidad;
    }

    // Constructor vacio
    public Vehiculo() {
    }

    // Getters
    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    // Setters
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    // Metodo
    public boolean buscarPlaca(String placaBuscar) {
        return this.placa == placaBuscar;
    }

}
