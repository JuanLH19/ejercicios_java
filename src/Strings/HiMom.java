package com.juan.capitulo6.main;

// Show two ways to concatenate the following two strings together to get the string "Hi, mom.":

public class HiMom {
    public static void main(String[] args) {
        String hi = "Hi, ";
        String mom = "mom.";
        String mensaje = hi.concat(mom);

        System.out.println(mensaje);
        System.out.println(hi.concat(mom));
    }
}
