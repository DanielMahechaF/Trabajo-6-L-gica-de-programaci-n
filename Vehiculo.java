public class Vehiculo {
    public String placa;
    public int modelo;
    public int capacidad;

    // Constructor
    public Vehiculo(String placa, int modelo, int capacidad) {
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

    public int getModelo() {
        return modelo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    // Setters
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    // Metodo
    public boolean buscarPlaca(String placaBuscar) {
        return this.placa != null && this.placa.equals(placaBuscar);
    }
    
    public boolean buscarCapacidad(int capacidadBuscar){
        return this.capacidad == capacidadBuscar;
    }

    public boolean buscarModelo (int modeloBuscar){
        return this.modelo == modeloBuscar;
    }
    // To String
    @Override
    public String toString() {
        return "Vehiculo [ placa= " + getPlaca() + ", modelo= " + getModelo() + ", capacidad= " + getCapacidad() +  "]";
    }

     public static boolean contains(String placaElim) {
        return placaElim != null && !placaElim.trim().isEmpty();
    }


}