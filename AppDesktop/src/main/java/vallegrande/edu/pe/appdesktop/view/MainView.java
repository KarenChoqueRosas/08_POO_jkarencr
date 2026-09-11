package vallegrande.edu.pe.appdesktop.view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class MainView extends BorderPane {

    private Button btnInicio;
    private Button btnUsuarios;
    private Button btnProductos;
    private Button btnReportes;
    private Button btnProveedores;
    private Button btnCategorias;

    public MainView() {
        crearMenu();
        mostrarInicio();
    }

    // =========================
    // MENÚ LATERAL
    // =========================

    private void crearMenu() {

        VBox menu = new VBox(15);
        menu.setPadding(new Insets(25));
        menu.setPrefWidth(220);

        Label titulo = new Label("🖥 MI SISTEMA");

        titulo.setStyle(
                "-fx-font-size: 20px;" +
                        "-fx-font-weight: bold;" +
                        "-fx-text-fill: white;"
        );

        btnInicio = crearBoton("Inicio");
        btnUsuarios = crearBoton("Usuarios");
        btnProductos = crearBoton("Productos");
        btnReportes = crearBoton("Reportes");
        btnProveedores = crearBoton("Proveedores");
        btnCategorias = crearBoton("Categorías");

        menu.getChildren().addAll(
                titulo,
                btnInicio,
                btnUsuarios,
                btnProductos,
                btnReportes,
                btnProveedores,
                btnCategorias
        );

        menu.setStyle("-fx-background-color: #f8ca16;");

        setLeft(menu);
    }

    private Button crearBoton(String texto) {

        Button boton = new Button(texto);

        boton.setPrefWidth(170);
        boton.setPrefHeight(40);

        boton.setStyle(
                "-fx-background-color: white;" +
                        "-fx-text-fill: #1E3A8A;" +
                        "-fx-font-size: 14px;" +
                        "-fx-background-radius: 8;"
        );

        return boton;
    }

    // =========================
    // INICIO
    // =========================

    public void mostrarInicio() {

        VBox contenido = new VBox(10);

        contenido.setAlignment(Pos.CENTER);

        Label titulo = new Label("BIENVENIDO");

        titulo.setStyle(
                "-fx-font-size: 28px;" +
                        "-fx-font-weight: bold;"
        );

        Label texto = new Label(
                "Panel principal de mi sistema"
        );

        contenido.getChildren().addAll(
                titulo,
                texto
        );

        setCenter(contenido);
    }

    // =========================
    // USUARIOS
    // =========================

    public void mostrarUsuarios() {

        VBox contenido = new VBox(20);

        contenido.setPadding(new Insets(30));

        Label titulo = new Label("USUARIOS");

        titulo.setStyle(
                "-fx-font-size: 26px;" +
                        "-fx-font-weight: bold;"
        );

        HBox tarjetas = new HBox(15);

        tarjetas.getChildren().addAll(

                crearTarjeta(
                        "Carlos Perez",
                        "Administrador"
                ),

                crearTarjeta(
                        "Maria Lopez",
                        "Vendedora"
                ),

                crearTarjeta(
                        "Piero Ramos",
                        "Supervisor"
                )
        );

        contenido.getChildren().addAll(
                titulo,
                tarjetas
        );

        setCenter(contenido);
    }

    // =========================
    // PRODUCTOS
    // =========================

    public void mostrarProductos() {

        VBox contenido = new VBox(20);

        contenido.setPadding(new Insets(30));

        Label titulo = new Label("PRODUCTOS");

        titulo.setStyle(
                "-fx-font-size: 26px;" +
                        "-fx-font-weight: bold;"
        );

        HBox tarjetas = new HBox(15);

        tarjetas.getChildren().addAll(

                crearTarjeta(
                        "Laptop Lenovo",
                        "S/ 2500"
                ),

                crearTarjeta(
                        "Mouse Logitech",
                        "S/ 80"
                ),

                crearTarjeta(
                        "Teclado Mecánico",
                        "S/ 180"
                )
        );

        contenido.getChildren().addAll(
                titulo,
                tarjetas
        );

        setCenter(contenido);
    }

    // =========================
    // REPORTES
    // =========================

    public void mostrarReportes() {

        VBox contenido = new VBox(20);

        contenido.setPadding(new Insets(30));

        Label titulo = new Label("REPORTES");

        titulo.setStyle(
                "-fx-font-size: 26px;" +
                        "-fx-font-weight: bold;"
        );

        Label descripcion = new Label(
                "Resumen general de la información registrada en el sistema."
        );

        HBox tarjetas = new HBox(15);

        tarjetas.getChildren().addAll(

                crearTarjeta(
                        "Usuarios",
                        "3 registrados"
                ),

                crearTarjeta(
                        "Productos",
                        "3 registrados"
                ),

                crearTarjeta(
                        "Proveedores",
                        "3 registrados"
                ),

                crearTarjeta(
                        "Categorías",
                        "3 registradas"
                )
        );

        contenido.getChildren().addAll(
                titulo,
                descripcion,
                tarjetas
        );

        setCenter(contenido);
    }

    // =========================
    // PROVEEDORES
    // =========================

    public void mostrarProveedores() {

        VBox contenido = new VBox(20);

        contenido.setPadding(new Insets(30));

        Label titulo = new Label("PROVEEDORES");

        titulo.setStyle(
                "-fx-font-size: 26px;" +
                        "-fx-font-weight: bold;"
        );

        Label descripcion = new Label(
                "Empresas encargadas de suministrar los productos."
        );

        HBox tarjetas = new HBox(15);

        tarjetas.getChildren().addAll(

                crearTarjeta(
                        "Tech Perú SAC",
                        "Equipos tecnológicos"
                ),

                crearTarjeta(
                        "Compu Center",
                        "Accesorios y periféricos"
                ),

                crearTarjeta(
                        "Digital Store",
                        "Computadoras y componentes"
                )
        );

        contenido.getChildren().addAll(
                titulo,
                descripcion,
                tarjetas
        );

        setCenter(contenido);
    }

    // =========================
    // CATEGORÍAS
    // =========================

    public void mostrarCategorias() {

        VBox contenido = new VBox(20);

        contenido.setPadding(new Insets(30));

        Label titulo = new Label("CATEGORÍAS");

        titulo.setStyle(
                "-fx-font-size: 26px;" +
                        "-fx-font-weight: bold;"
        );

        Label descripcion = new Label(
                "Clasificación de los productos disponibles."
        );

        HBox tarjetas = new HBox(15);

        tarjetas.getChildren().addAll(

                crearTarjeta(
                        "Tecnología",
                        "Laptops y computadoras"
                ),

                crearTarjeta(
                        "Accesorios",
                        "Mouse, teclados y audífonos"
                ),

                crearTarjeta(
                        "Periféricos",
                        "Dispositivos complementarios"
                )
        );

        contenido.getChildren().addAll(
                titulo,
                descripcion,
                tarjetas
        );

        setCenter(contenido);
    }

    // =========================
    // TARJETAS
    // =========================

    private VBox crearTarjeta(
            String titulo,
            String detalle
    ) {

        VBox tarjeta = new VBox(8);

        tarjeta.setPadding(new Insets(20));
        tarjeta.setPrefWidth(180);

        tarjeta.setStyle(
                "-fx-background-color: #EAF2FF;" +
                        "-fx-background-radius: 12;"
        );

        Label nombre = new Label(titulo);

        nombre.setStyle(
                "-fx-font-size: 16px;" +
                        "-fx-font-weight: bold;"
        );

        Label info = new Label(detalle);

        info.setWrapText(true);

        tarjeta.getChildren().addAll(
                nombre,
                info
        );

        return tarjeta;
    }

    // =========================
    // GETTERS DE BOTONES
    // =========================

    public Button getBtnInicio() {
        return btnInicio;
    }

    public Button getBtnUsuarios() {
        return btnUsuarios;
    }

    public Button getBtnProductos() {
        return btnProductos;
    }

    public Button getBtnReportes() {
        return btnReportes;
    }

    public Button getBtnProveedores() {
        return btnProveedores;
    }

    public Button getBtnCategorias() {
        return btnCategorias;
    }
}