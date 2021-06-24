package src.carro;

import src.Interfaces.Aceleracion;
import src.Interfaces.Transporte;
import src.Interfaces.girar;

public class Camion extends Vehiculo implements girar, Transporte, Aceleracion{

    
    public Camion() {
    }

    public Camion(int cantGalones, int cantPasajero, int velocidadMaxima, double aceleracion, boolean gasofa) {
        super(cantGalones, cantPasajero, velocidadMaxima, aceleracion, gasofa);
    }

    @Override
    public void irDerecha() {
        System.out.println("\n Voy a la derecha");  
    }

    @Override
    public void irIzquierda() {
        System.out.println("\n Voy a la izquierda");
        
    }

    @Override
    public void utilidad() {
        System.out.println("\n Transpotando Materiales");
        
    }

    @Override
    public void acelera() {
        System.out.println("\n Aceleracion Baja");
        
    }
    
}
