package com.juan.ejerciciosoperadores.main;

/*
Change the following program to use compound assignments:

class ArithmeticDemo {

    public static void main (String[] args){

        int result = 1 + 2; // result is now 3
        System.out.println(result);

        result = result - 1; // result is now 2
        System.out.println(result);

        result = result * 2; // result is now 4
        System.out.println(result);

        result = result / 2; // result is now 2
        System.out.println(result);

        result = result + 8; // result is now 10
        result = result % 7; // result is now 3
        System.out.println(result);

    }
}

*/

public class OperadoresAsignacionComp {
    public static void main(String[] args) {
        int resultado = 3; //Resultado vale 3
        System.out.println(resultado);

        resultado -= 1; //Resultado ahora es 2
        System.out.println(resultado);

        resultado *= 2; //Resultado ahora es 4
        System.out.println(resultado);

        resultado /= 2; //Resultado ahora es 2
        System.out.println(resultado);

        resultado += 8; //Resultado ahora es 10
        System.out.println(resultado);

        resultado %=7; //Resultado ahora es 3
        System.out.println(resultado);


    }
}
