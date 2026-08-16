package org.vallegrande.edu.pe.controller;
import org.vallegrande.edu.pe.model.Libro;
import org.vallegrande.edu.pe.model.Sede;
import java.util.ArrayList;

public class BibliotecaController {

    //Lista donden almacenaremos nuestros libros
    private ArrayList<Libro> libros;

    private ArrayList<Sede> sedes;

    //Constructor
    public BibliotecaController() {
        libros = new ArrayList<>();
        sedes = new ArrayList<>();
    }

    //Registrar
    public void agregarLibro(Libro libro){
        libros.add(libro);
        System.out.println("Libro registrado correctamente");
    }

    //Listar
    public void listarLibros(){
        if(libros.isEmpty()){
            System.out.println("No hay libros registrados");
            return;
        }
        System.out.println("LISTA DE LIBROS");
        for ( Libro libro: libros){
            libro.mostrarLibro();
        }
    }
    //Buscar
    public void buscarLibro(String criterio){
        boolean encontrado = false;
        String texto = criterio.toLowerCase();
        for ( Libro libro: libros){
            if(libro.getTitulo().toLowerCase().contains(texto) ||
                    libro.getAutor().toLowerCase().contains(texto)) {
                libro.mostrarLibro();
                encontrado = true;
            }
        }
        if (!encontrado){
            System.out.println("No se encontro ningun libro");
        }
    }
    // Registrar sede
    public void agregarSede(Sede sede) {
        sedes.add(sede);
        System.out.println("Sede registrada correctamente");
    }

    // Listar sedes
    public void listarSedes() {
        if (sedes.isEmpty()) {
            System.out.println("No hay sedes registradas");
            return;
        }

        System.out.println("LISTA DE SEDES");

        for (Sede sede : sedes) {
            sede.mostrarSede();
        }
    }
}