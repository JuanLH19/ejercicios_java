package com.juan.clase1.main;

public class Semaforo {

    //Argumentos para el constructor en la declaración
    public enum ColorSemaforo{
        ROJO ("Rojo", 60),
        AMARILLO ("Amarillo", 25),
        VERDE ("Verde", 45); //Se requiere el punto y coma cuando hay
        //mas código en la definición del enum

        private String nombreColor; //atributos
        private int segundosColor; // atributos

        //Constructor
        private ColorSemaforo (String nombreColor, int segundosColor){
            this.nombreColor = nombreColor;
            this.segundosColor = segundosColor;
        }

        //Métodos getters
        public String getNombreColor(){
            return nombreColor;
        }
        public int getSegundosColor(){
            return segundosColor;
        }
    }


}
