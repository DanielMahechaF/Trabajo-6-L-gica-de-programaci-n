public class Vehiculo {
    public String marca;
    public String modelo;
    public int capacidad;
    
    //Constructor
    public Vehiculo(String marca, String modelo, int capacidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidad = capacidad;
    }
    // Constructor vacio 
    public Vehiculo(){
    }
    //Getters 
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public int getCapacidad() {
        return capacidad;
    }
    // Setters 
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    
    
}

