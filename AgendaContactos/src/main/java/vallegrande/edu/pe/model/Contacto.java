package vallegrande.edu.pe.model;

public class Contacto {

    // Atributos
    private int id;
    private String nombres;
    private String apellidos;
    private String direccion;
    private String telefono;
    private String correo;

    // Constructor
    public Contacto(
            int id,
            String nombres,
            String apellidos,
            String direccion,
            String telefono,
            String correo
    ) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
    }

    // Obtener el ID
    public int getId() {
        return id;
    }

    // Obtener los nombres
    public String getNombres() {
        return nombres;
    }

    // Obtener los apellidos
    public String getApellidos() {
        return apellidos;
    }

    // Mostrar contacto
    public void mostrarContacto() {
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombres + " " + apellidos);
        System.out.println("Dirección: " + direccion);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Correo: " + correo);
        System.out.println("-----------------------------------");
    }
}
