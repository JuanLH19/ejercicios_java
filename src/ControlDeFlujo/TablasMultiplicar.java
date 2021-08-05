package com.juan.ejerciciostarea.main;

public class TablasMultiplicar {
    public static void main(String[] args) {

        System.out.println("Tablas de Multiplicar del 1 al 10");
        System.out.println("---------------------------------------->");

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++){
                System.out.print(i * j + "\t");
                //System.out.print(" \t ");
            }
            System.out.println();
        }
    }
}
