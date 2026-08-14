package vallegrande.edu.pe.view;

public class AgendaView {

    // Mostrar título
    public void mostrarTitulo() {
        System.out.println("---------------------------");
        System.out.println("     AGENDA DE CONTACTOS");
        System.out.println("---------------------------");
    }

    // Mostrar el menú
    public void mostrarMenu() {
        System.out.println("\n1. Registrar contacto");
        System.out.println("2. Listar contactos");
        System.out.println("3. Buscar contacto");
        System.out.println("4. Eliminar contacto");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opción: ");
    }

    // Mostrar un mensaje
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}