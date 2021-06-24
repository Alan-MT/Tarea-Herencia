package src;

import java.util.Scanner;

import src.carro.*;

public class Principal {
    Scanner Scan = new Scanner(System.in);
    Vehiculo[] autoVehiculos = new Vehiculo[20];

    public static void main(String[] args) {
        Principal pc = new Principal();

    }

    public Principal() {
        CreacionAuto(autoVehiculos);
        menu();

    }

    public String intancias(Vehiculo c) {
        if (c instanceof Camioneta) {
            return "Es una camioneta de pasajeros";
        } else if (c instanceof Camion) {
            return "Es un Camion de Carga";
        } else {
            return "Es un auto de carreas";
        }
    }

    public void imprirAutos(Vehiculo[] autp) {
        for (int i = 0; i < autp.length; i++) {
            System.out.println("\n El auto " + (i + 1) + " " + intancias(autp[i]));
            System.out.println("\n " + autp[i].toString());
        }
    }

    public void menu(){
        int opcion = 0;
        do{
        System.out.println("\n----Vehiculos----");
        System.out.println("\n      MENU    ");
        System.out.println("\n 1. Mostrar Autos");
        System.out.println("\n 2. utilidad de Autos");
        System.out.println("\n 3. mostras Categorias");
        System.out.println("\n 4. Salir");
        opcion = Scan.nextInt();
        switch (opcion) {
            case 1: 
                imprirAutos(autoVehiculos);
                break;
            case 2:
             utilidad();
                break;
            case 3:
            submenuTipoEspecifico(autoVehiculos);
            break;
            case 4:
            System.out.println("Hasta pronto");
                break;

            default:
            System.out.println("Numero incorrecto");
                break;
        }
    }while(opcion != 4 );
}

    public void CreacionAuto(Vehiculo[] jun) {
        for (int j = 0; j < jun.length; j++) {
            int crear = (int) (Math.random() * 100 + 1);
            if (crear <= 30) {
                jun[j] = new Camion(crear * 5, 3, 100, crear * 2.38, false);

            } else if (crear >= 65) {
                jun[j] = new Camioneta(crear * 3, crear, crear * 2, crear * 2.75, false);

            } else {
                jun[j] = new Carrera(crear * 4, 1, crear * 75, crear * 7.5, true);

            }
        }

    }

    public void utilidad() {
        boolean salir = true;
        Camioneta st = new Camioneta();
        do {
            System.out.println("\n utlidad de los auto");
            System.out.println("\n Elige el auto");
            int eleccion = Scan.nextInt();
            System.out.println(intancias(autoVehiculos[eleccion]));
            System.out.println(autoVehiculos[eleccion].toString());
            System.out.println("\n 1. Girar al izuiqerda");
            System.out.println("2. Girar al a derecha");
            System.out.println("3. Acelerar");
            int eleccions = Scan.nextInt();
            if (eleccions == 1) {
                st.irIzquierda();
                salir = false;
            } else if (eleccions == 2) {
                st.irDerecha();
                salir = false;
            } else if (eleccions == 3) {
                st.acelera();
                salir = false;
            }

        } while (salir == true);

    }
  
    public void submenuTipoEspecifico(Vehiculo[] autos) {

        System.out.println("\n  Elija el tipo de vehiculos que desea ver: ");
        System.out.println("    1. Camioneta");
        System.out.println("    2. Vehiculo de Carga");
        System.out.println("    3. Auto de Carrera");
        System.out.print("\n  Escriba el numero de la opcion: ");
        int opcion = Integer.parseInt(Scan.nextLine());

        switch (opcion) {
            case 1:
                System.out.println("\n\n   - CAMIONETAS -");
                imprimirTipoEspecifico(autos, 1);
                break;
            case 2:
                System.out.println("\n\n   - VEHICULOS DE CARGA -");
                imprimirTipoEspecifico(autos, 2);
                break;
            case 3:
                System.out.println("\n\n   - AUTOS DE CARRERAS -");
                imprimirTipoEspecifico(autos, 3);
                break;
            default:
                System.out.println("\n\n  Opcion incorrecta\n");
                break;
        }
        System.out.println();
    }

    public void imprimirTipoEspecifico(Vehiculo[] autos, int tipo) {

        for (int i = 0; i < autos.length; i++) {

            if (tipo == 1 && autos[i] instanceof Camioneta) {
                System.out.print("\n\n  Vehiculo No. " + (i + 1));
                System.out.println(autos[i].toString());

            } else if (tipo == 2 && autos[i] instanceof Camion) {
                System.out.print("\n\n  Vehiculo No. " + (i + 1));
                System.out.println(autos[i].toString());

            } else if (tipo == 3 && autos[i] instanceof Carrera) {
                System.out.print("\n\n  Vehiculo No. " + (i + 1));
                System.out.println(autos[i].toString());
            }
        }

    }
}
