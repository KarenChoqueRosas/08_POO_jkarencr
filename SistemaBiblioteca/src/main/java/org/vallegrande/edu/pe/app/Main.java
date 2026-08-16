package org.vallegrande.edu.pe.app;

import org.vallegrande.edu.pe.controller.BibliotecaController;
import org.vallegrande.edu.pe.model.Libro;
import org.vallegrande.edu.pe.model.Sede;
import org.vallegrande.edu.pe.view.BibliotecaView;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        BibliotecaController controller = new BibliotecaController();
        BibliotecaView view = new BibliotecaView();
        Scanner scanner = new Scanner(System.in);

        int opcion;

        do {
            view.mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1: {
                    System.out.println("\n--- REGISTRAR LIBRO ---");

                    System.out.print("ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Título: ");
                    String titulo = scanner.nextLine();

                    System.out.print("Autor: ");
                    String autor = scanner.nextLine();

                    System.out.print("Año: ");
                    int anio = scanner.nextInt();
                    scanner.nextLine();

                    // Validar datos del libro
                    if (id <= 0 || titulo.isEmpty()
                            || autor.isEmpty() || anio <= 0) {

                        System.out.println("Datos no válidos");

                    } else {
                        Libro libro = new Libro(id, titulo, autor, anio);
                        controller.agregarLibro(libro);
                    }

                    break;
                }

                case 2:
                    controller.listarLibros();
                    break;

                case 3: {
                    System.out.print("Ingrese título o autor: ");
                    String criterio = scanner.nextLine();
                    controller.buscarLibro(criterio);
                    break;
                }

                case 4: {
                    System.out.println("\n--- REGISTRAR SEDE ---");

                    System.out.print("ID: ");
                    int idSede = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Nombre: ");
                    String nombreSede = scanner.nextLine();

                    System.out.print("Dirección: ");
                    String direccionSede = scanner.nextLine();

                    // Validar datos de la sede
                    if (idSede <= 0 || nombreSede.isEmpty()
                            || direccionSede.isEmpty()) {

                        System.out.println("Datos de la sede no válidos");

                    } else {
                        Sede sede = new Sede(
                                idSede,
                                nombreSede,
                                direccionSede
                        );

                        controller.agregarSede(sede);
                    }

                    break;
                }

                case 5:
                    controller.listarSedes();
                    break;

                case 6:
                    System.out.println("Hasta luego.");
                    break;

                default:
                    System.out.println("Opción no válida");
            }

        } while (opcion != 6);

        scanner.close();
    }
}