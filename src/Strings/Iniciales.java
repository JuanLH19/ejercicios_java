package com.juan.capitulo6.main;
import java.util.*;
public class Iniciales {
    public static void main(String[] args) {
        String name = "Juan Leyva Hernández";
        System.out.println("Mi nombre completo es: " + name);
        System.out.print("Mis iniciales son: ");
        int len = name.length();
        name = name.trim();
        String str1 = "";
        for (int i = 0; i < len; i++) {
            char ch = name.charAt(i);
            if (ch != ' ') {
                str1 = str1 + ch;
            } else {
                System.out.print(Character.toUpperCase(str1.charAt(0)) + ". ");
                str1 = "";
            }
        }
        String str2 = "";
        for (int j = 0; j < str1.length(); j++) {
            if (j == 0)
                str2 = str2 + Character.toUpperCase(str1.charAt(0));
            else
                str2 = str2 + Character.toLowerCase(str1.charAt(j));
        }

        System.out.println(str2);
    }
}