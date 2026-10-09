package org.vallegrande.edu.pe.model;

public class Sede {

    // Atributos
    private int id;
    private String nombre;
    private String direccion;

    // Constructor
    public Sede(int id, String nombre, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    // Mostrar datos de la sede
    public void mostrarSede() {
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Dirección: " + direccion);
        System.out.println("--------------------------------");
    }
}