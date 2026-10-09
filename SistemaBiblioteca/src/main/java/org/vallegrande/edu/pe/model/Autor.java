package org.vallegrande.edu.pe.model;

public class Autor {

    // Atributos
    private int id;
    private String nombre;

    // Constructor
    public Autor(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    // Mostrar autor
    public void mostrarAutor() {
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("--------------------------------");
    }
}