package com.juan.ejerciciosasignaciones.main;

public class SobrecargaBoxingTiposPrimitivos {
    public static void main(String[] args) {
        int intvar = 10;
        System.out.println("\nmetodo (intVar)\u003B");
        metodo (intvar);
    }

    static void metodo (long v) { System.out.print ("-> amplia a long y ejecuta metodo (long v)\n");}
    static void metodo (Integer v) {System.out.print ("-> boxing a Integer y ejecuta metodo (Integer v)\n");}
}
