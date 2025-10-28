public class Viaje {
    private String viaje;
    private String conductor;
    // Constructores
    public Viaje(String viaje, String conductor) {
        this.viaje = viaje;
        this.conductor = conductor;
    }
    public Viaje(){

    }
    // Getters 
    public String getViaje() {
        return viaje;
    }
    public String getConductor() {
        return conductor;
    }
    //Setters
    public void setViaje(String viaje) {
        this.viaje = viaje;
    }
    public void setConductor(String conductor) {
        this.conductor = conductor;
    }
    

}
