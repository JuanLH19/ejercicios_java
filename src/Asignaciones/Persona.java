package com.juan.ejerciciosasignaciones.main;

public class Persona {
    private String nombre;
    private int edad;
    //... // Constructores, getters, setters

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public static void main (String[] args){
        Persona[] familia = new Persona[3];
        familia[0] = new Persona("Maria", 35);
        familia[1] = new Persona("Jose", 30);
        familia[2] = new Persona("Ana", 3);
    }
}
