package org.vallegrande.edu.pe.view;

public class BibliotecaView {
    //TITULO
    public void mostrarTitulo(){
        System.out.println("=================");
        System.out.println("SISTEMA DE BIBLIOTECA VG");
        System.out.println("=================");
    }
    //MENU
    public void mostrarMenu() {
        System.out.println("\n--- SISTEMA DE BIBLIOTECA ---");
        System.out.println("1. Registrar libro");
        System.out.println("2. Listar libros");
        System.out.println("3. Buscar libro");
        System.out.println("4. Registrar sede");
        System.out.println("5. Listar sedes");
        System.out.println("6. Registrar autor");
        System.out.println("7. Listar autores");
        System.out.println("8. Salir");
        System.out.print("Seleccione una opción: ");
    }
    //MENSAJE
    public void mostrarMensaje( String mensaje){
        System.out.println(mensaje);
    }
}