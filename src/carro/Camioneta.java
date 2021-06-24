package src.carro;

import src.Interfaces.*;

public class Camioneta extends Vehiculo implements girar, Transporte, Aceleracion{


    public Camioneta(int cantGalones, int cantPasajero, int velocidadMaxima, double aceleracion, boolean gasofa) {
        super(cantGalones, cantPasajero, velocidadMaxima, aceleracion, gasofa);
    }

    public Camioneta() {
    }

    @Override
    public void irDerecha() {
        System.out.println("\n ------>");  
    }

    @Override
    public void irIzquierda() {
        System.out.println("\n <--------");
        
    }

    @Override
    public void utilidad() {
        System.out.println("\n Transpotando personas");
        
    }

    @Override
    public void acelera() {
        System.out.println("\n Aceleracion Normal");
        
    }
    @Override
    public String toString() {
        return "\nGalones: " + CantGalones + "\nCantitdad Pasajero: " + CantPasajero + "\nTipo de Combustible: " + getTipoCombus(Gasofa)
                + "\nVelocidad Maxima: " + VelocidadMaxima + "\naceleracion base: " + aceleracion;
    }

    
}
