package com.juan.ejerciciosoperadores.main;

//In the following program, explain why the value "6" is printed twice in a row:
public class PrePostDemo {

    public static void main(String[] args) {
        /*
        El valor de 6 se repite dos veces debido a que ++i primero realiza el incremento y posterior
        analiza i, y el incremento i++ primero analiza i antes de hacer el incremento, por esa razon primero
        devuelve el valor de 6 antes de aplicar el incremento a i.
         */
        int i = 3;
        i++;
        System.out.println(i);    // "4"
        ++i;
        System.out.println(i);    // "5"
        System.out.println(++i);  // "6"
        System.out.println(i++);  // "6"
        System.out.println(i);    // "7"

    }
}
