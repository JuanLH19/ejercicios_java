package com.juan.ejerciciosoperadores.main;
/*
Produce the output 33. You must use exactly each fragment once.

FRAGMENTS.
y   y   y   y
y   x   x
*=  *=  *=  -=
 */
public class Incremento {
    public static void main(String[] args) {
        Integer x = 7;
        int y = 2;
        x /* Starts here*/*= x;  // X pasa a tener el valor de 49
        y *= y;  // y pasa a tener el valor de 4
        y *= y;  // y = 16
        x -= y;  // x = 49 - 16 = 33
        System.out.println(x);
    }
}
