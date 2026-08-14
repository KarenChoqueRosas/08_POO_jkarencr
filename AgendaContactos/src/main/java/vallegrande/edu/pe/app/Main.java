package vallegrande.edu.pe.app;

import vallegrande.edu.pe.controller.AgendaController;
import vallegrande.edu.pe.model.Contacto;
import vallegrande.edu.pe.view.AgendaView;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Crear los componentes
        AgendaController controller = new AgendaController();
        AgendaView view = new AgendaView();
        Scanner scanner = new Scanner(System.in);

        int opcion;
        int siguienteId = 1;

        // Mostrar información
        view.mostrarTitulo();

        do {
            view.mostrarMenu();
            opcion = leerOpcion(scanner);

            switch (opcion) {

                case 1:
                    System.out.println("\n=== REGISTRAR CONTACTO ===");

                    String nombres = leerCampoObligatorio(
                            scanner,
                            "Nombres: "
                    );

                    String apellidos = leerCampoObligatorio(
                            scanner,
                            "Apellidos: "
                    );

                    String direccion = leerCampoObligatorio(
                            scanner,
                            "Dirección: "
                    );

                    String telefono = leerCampoObligatorio(
                            scanner,
                            "Teléfono: "
                    );

                    String correo = leerCampoObligatorio(
                            scanner,
                            "Correo electrónico: "
                    );

                    Contacto nuevoContacto = new Contacto(
                            siguienteId,
                            nombres,
                            apellidos,
                            direccion,
                            telefono,
                            correo
                    );

                    controller.agregarContacto(nuevoContacto);
                    siguienteId++;
                    break;

                case 2:
                    controller.listarContactos();
                    break;

                case 3:
                    System.out.println("\n=== BUSCAR CONTACTO ===");

                    String criterio = leerCampoObligatorio(
                            scanner,
                            "Ingrese el nombre o apellido: "
                    );

                    controller.buscarContacto(criterio);
                    break;

                case 4:
                    System.out.println("\n=== ELIMINAR CONTACTO ===");
                    controller.listarContactos();

                    int id = leerNumero(
                            scanner,
                            "Ingrese el ID del contacto: "
                    );

                    boolean eliminado = controller.eliminarContacto(id);

                    if (eliminado) {
                        view.mostrarMensaje(
                                "Contacto eliminado correctamente."
                        );
                    } else {
                        view.mostrarMensaje(
                                "No se encontró un contacto con ese ID."
                        );
                    }
                    break;

                case 5:
                    view.mostrarMensaje(
                            "\nGracias por utilizar la agenda."
                    );
                    break;

                default:
                    view.mostrarMensaje(
                            "Opción incorrecta. Ingrese un número del 1 al 5."
                    );
            }

        } while (opcion != 5);

        scanner.close();
    }

    // Leer y validar la opción del menú
    private static int leerOpcion(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println(
                    "Entrada inválida. Debe ingresar un número."
            );
            scanner.nextLine();
            System.out.print("Seleccione una opción: ");
        }

        int opcion = scanner.nextInt();
        scanner.nextLine();

        return opcion;
    }

    // Leer un campo obligatorio
    private static String leerCampoObligatorio(
            Scanner scanner,
            String mensaje
    ) {
        String valor;

        do {
            System.out.print(mensaje);
            valor = scanner.nextLine().trim();

            if (valor.isEmpty()) {
                System.out.println(
                        "El campo es obligatorio. Intente nuevamente."
                );
            }

        } while (valor.isEmpty());

        return valor;
    }

    // Leer y validar un número
    private static int leerNumero(
            Scanner scanner,
            String mensaje
    ) {
        System.out.print(mensaje);

        while (!scanner.hasNextInt()) {
            System.out.println(
                    "Entrada inválida. Debe ingresar un número."
            );
            scanner.nextLine();
            System.out.print(mensaje);
        }

        int numero = scanner.nextInt();
        scanner.nextLine();

        return numero;
    }
}