package com.juan.capitulo6.main;

public class StringPool {
    public static void main(String[] args) {

        //Ejemplo 1
        String nA = "Pepe";
        String nB = new String("Pepe");

        if (nA == nB){
            System.out.println("L1");
        } else if (nA == "Pepe") {
            System.out.println("L2");
        } else System.out.println("L3");


        //Ejemplo 2
        String[] holaArr = { "h", "o", "l", "a"};
        String holaStr = null;

        for (String str : holaArr){
            holaStr+=str;
        }

        if ("hola" == holaStr) {
            System.out.println("L1" + holaStr);
        } else if ("hola" == holaStr.intern()) {
            System.out.println("L2" + holaStr);
        } else {
            System.out.println("L3" + holaStr);
        }



    }
}
