package com.company;

public class Main {

    public static void main(String[] args) {
        // EJERCICIO 1 //

        int resultado;
        resultado = suma(15, 25, 8);
        System.out.println(resultado);

        // EJERCICIO 2 //
        Coche miCoche = new Coche();
        miCoche.ponerPuertas();
        System.out.println(miCoche.cantidadPuertas);
    }

    // EJERCICIO 1 //

    public static int suma(int a, int b, int c){
        return a + b + c;
    }

    // EJERCICIO 2 //
    static class Coche{
        public int cantidadPuertas=0;

        public void ponerPuertas(){
            this.cantidadPuertas++;
        }
    }

}