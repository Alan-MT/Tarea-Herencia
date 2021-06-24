package src.carro;

public abstract class Vehiculo{

    protected int CantGalones, CantPasajero, VelocidadMaxima;
    protected double aceleracion;
    protected boolean Gasofa;

    public Vehiculo(){

    }
    public Vehiculo(int cantGalones, int cantPasajero, int velocidadMaxima, double aceleracion, boolean gasofa) {
        CantGalones = cantGalones;
        CantPasajero = cantPasajero;
        VelocidadMaxima = velocidadMaxima;
        this.aceleracion = aceleracion;
        Gasofa = gasofa;
    }
    public int getCantGalones() {
        return CantGalones;
    }
    public void setCantGalones(int cantGalones) {
        CantGalones = cantGalones;
    }
    public int getCantPasajero() {
        return CantPasajero;
    }
    public void setCantPasajero(int cantPasajero) {
        CantPasajero = cantPasajero;
    }
    public int getVelocidadMaxima() {
        return VelocidadMaxima;
    }
    public void setVelocidadMaxima(int velocidadMaxima) {
        VelocidadMaxima = velocidadMaxima;
    }
    public double getAceleracion() {
        return aceleracion;
    }
    public void setAceleracion(double aceleracion) {
        this.aceleracion = aceleracion;
    }
    public boolean isGasofa() {
        return Gasofa;
    }
    public void setGasofa(boolean gasofa) {
        Gasofa = gasofa;
    }

    public String getTipoCombus(boolean tipo){
        if (tipo) {
            return "Gasolina";
        } else{
            return "Diesel";
        }
        
    }



    
    
}