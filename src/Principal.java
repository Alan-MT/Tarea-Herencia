package src;

import java.util.ArrayList;

import src.carro.*;

public class Principal {
    
    public static void main(String[] args) {
        Principal pc = new Principal();

    }
    public Principal(){
        Vehiculo[] autoVehiculos = new Vehiculo[20];
        imprirAutos(autoVehiculos);

    }

    public  String intancias(Vehiculo c){
        if (c instanceof Camioneta) {
            return "Es una camionesta de pasajeros";
        } else if (c instanceof Camion) {
            return "Es un Camion de Carga";
        } else {
            return "Es un auto de carreas";
        }
    }
    public void imprirAutos(Vehiculo[] autp){
        for (int i = 0; i < autp.length; i++) {
            System.out.println("\n El auto es "+ (i+1)+intancias(autp[i]));
            System.out.println("\n"+autp[i].toString());
        }
    }

    public void menu(){
        System.out.println("\n----Vehiculos----");
        System.out.println("\n      MENU    ");
        System.out.println("\n 1. Mostrar Autos");
        System.out.println("\n 2. utilidad de Autos");
        System.out.println("\n 3. Ver Autos por Categorias");
        

    }
}

