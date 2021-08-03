package com.juan.clase1.main;

public class Identificadores {
    public static void main(String[] args) {

        /*
        Un identificador en Java debe comenzar por una letra, el signo de subrayado “_” o símbolo de moneda.
        Los siguientes caracteres pueden ser cualquier combinación de letras, números, caracteres de moneda o conectores.
        No tienen longitud máxima.
        Se diferencia entre mayúsculas y minúsculas.
        Un identificador no puede ser una palabra clave de Java, pero puede contener una palabra clave como parte de su nombre.
         */

        String nombreUsuario = "Juan";
        String codInterno10 = "AAA0101";
        String _talla = "XL";
        int $sumaNumeros = 60;
        int $105 = 105;
        int thisvar = 10;
        String miVariable = "compila";

        System.out.println("Nombre Usuario: " + nombreUsuario);
        System.out.println("Codigo Interno: " + codInterno10);
        System.out.println("Talla: " + _talla);
        System.out.println("Suma numeros: " + $sumaNumeros);
        System.out.println("$105: " + $105 + ", ThisVar: " + thisvar);
        System.out.println("Mi Variable: " + miVariable);
    }
}
