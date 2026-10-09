package vallegrande.edu.pe.controller;

import vallegrande.edu.pe.model.Contacto;

import java.util.ArrayList;

public class AgendaController {

    // Lista para almacenar los contactos
    private ArrayList<Contacto> contactos;

    // Constructor
    public AgendaController() {
        contactos = new ArrayList<>();
    }

    // Agregar contacto
    public void agregarContacto(Contacto contacto) {
        contactos.add(contacto);
        System.out.println("\nContacto agregado correctamente.");
    }

    // Listar contactos
    public void listarContactos() {
        System.out.println("\n=== LISTA DE CONTACTOS ===");

        if (contactos.isEmpty()) {
            System.out.println("No hay contactos registrados.");
            return;
        }

        for (Contacto contacto : contactos) {
            contacto.mostrarContacto();
        }
    }

    // Buscar por nombre o apellido
    public void buscarContacto(String criterio) {
        boolean encontrado = false;
        String textoBuscado = criterio.toLowerCase();

        System.out.println("\n=== RESULTADOS DE BÚSQUEDA ===");

        for (Contacto contacto : contactos) {
            String nombres = contacto.getNombres().toLowerCase();
            String apellidos = contacto.getApellidos().toLowerCase();

            if (nombres.contains(textoBuscado)
                    || apellidos.contains(textoBuscado)) {

                contacto.mostrarContacto();
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontraron contactos.");
        }
    }

    // Eliminar contacto por ID
    public boolean eliminarContacto(int id) {
        for (int i = 0; i < contactos.size(); i++) {

            if (contactos.get(i).getId() == id) {
                contactos.remove(i);
                return true;
            }
        }

        return false;
    }
}
