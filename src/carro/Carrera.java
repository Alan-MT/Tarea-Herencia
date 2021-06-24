package src.carro;

import src.Interfaces.*;

public class Carrera extends Vehiculo implements girar,Aceleracion{

    public Carrera(){
        
    }

    public Carrera(int cantGalones, int cantPasajero, int velocidadMaxima, double aceleracion, boolean gasofa) {
        super(cantGalones, cantPasajero, velocidadMaxima, aceleracion, gasofa);
    }

    @Override
    public void irDerecha( ) {
        System.out.println("\n turn Right");        
    }

    @Override
    public void irIzquierda() {
        System.out.println("\n turn left");        
    }

    @Override
    public void acelera() {
        System.out.println("\n Aceleracion Turbo es el triple de la aceleracion base");        
    }
    
    @Override
    public double getAceleracion(){
        return 3*super.aceleracion;
    }

    @Override
    public String toString() {
        return "\nGalones: " + CantGalones + "\nCantitdad Pasajero: " + CantPasajero + "\nTipo de Combustible: " + getTipoCombus(Gasofa)
                + "\nVelocidad Maxima: " + VelocidadMaxima + "\naceleracion base: " + aceleracion+ "\nAceleracion turbo: "+getAceleracion();
    }

}
