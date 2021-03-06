package com.juan.capitulo6.main;

import java.util.Locale;

public class StringInmutabilidad {
    public static void main(String[] args) {

        //Ejemplo 1
        String str1 = "123";
        for(int i = 0; i < 5; i++) {
            str1.concat(i + 4 + "");
        }
        System.out.println(str1);


        //Ejemplo 2
        StringBuffer a = new StringBuffer("Hola");
        String b = "Mundo";
        a.append(b);


        //Ejemplo 3
        String a1 = "hola";
        String a2 = a1.substring(2).concat("123").toUpperCase();
        System.out.println(a1);

        //Ejemplo 4
        String b1 = "hola";
        b1.toUpperCase();
        if(!"HOLA".equals(b1)) {
            System.out.println("L1: "+b1);
        }
        else {
            System.out.println("L2: "+b1);
        }

    }
}

