package com.juan.capitulo6.main;

public class ArreglosReferencias {
    public static void main(String[] args) {

        System.out.println("1.-----------");
        String [] bugs = {"Grillo", "Abeja", "Catarina"};
        String [] alias = bugs;
        System.out.println(bugs.equals(alias)); //Nos imprimira true
        System.out.println(bugs == alias); //Nos imprimira true
        System.out.println(bugs.toString());


        //Ejemplo 2 -lenght
        System.out.println("2.--------------");
        String [] arreglo = new String[10];
        String [] arregloA = {null, null, null};
        System.out.println(arreglo.length);
        System.out.println(arregloA.length);
    }
}
