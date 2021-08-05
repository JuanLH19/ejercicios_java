package com.juan.capitulo6.main;

public class StringBuildEjemplos {
    public static void main(String[] args) {

        //Ejemplo 1
        StringBuilder sbA = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            sbA.append(i + 1);
        }
        System.out.println(sbA);


        //Ejemplo 2
        StringBuilder sbB =new StringBuilder(5);
        for (int i = 0; i < 10 ; i++) {
            sbB.append(i + 1);
        }
        System.out.println(sbB.length());


        //Ejemplo 3
        StringBuilder sbC = new StringBuilder("Hola");
        StringBuilder sbD = new StringBuilder(sbC).append("Mundo");
        System.out.println(sbD);
    }
}
