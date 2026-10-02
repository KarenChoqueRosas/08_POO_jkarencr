package vallegrande.edu.pe.misistema.view;

import java.util.List;

import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import vallegrande.edu.pe.misistema.model.Usuario;

public class MainView extends BorderPane {

    private Button btnInicio;
    private Button btnUsuarios;
    private final Button btnRegistrar = new Button("Registrar");

    private final TextField txtNombre = new TextField();
    private final TextField txtApellido = new TextField();
    private final TextField txtCorreo = new TextField();

    private final ComboBox<String> cboEstado = new ComboBox<>(
            FXCollections.observableArrayList("Activo", "Inactivo")
    );

    private TableView<Usuario> tablaUsuarios;

    public MainView() {
        txtNombre.setPromptText("Nombre");
        txtApellido.setPromptText("Apellido");
        txtCorreo.setPromptText("Correo");
        cboEstado.setValue("Activo");

        crearMenu();
        crearTabla();
        mostrarInicio();
    }

    private void crearMenu() {
        VBox menu = new VBox(15);
        menu.setPadding(new Insets(25));
        menu.setPrefWidth(220);
        menu.setStyle("-fx-background-color: #f8ca16;");

        Label titulo = new Label("MI SISTEMA");
        titulo.setStyle(
                "-fx-font-size: 20px;" +
                        "-fx-font-weight: bold;" +
                        "-fx-text-fill: white;"
        );

        btnInicio = crearBoton("Inicio");
        btnUsuarios = crearBoton("Usuarios");

        menu.getChildren().addAll(titulo, btnInicio, btnUsuarios);
        setLeft(menu);
    }

    private Button crearBoton(String texto) {
        Button boton = new Button(texto);
        boton.setPrefWidth(170);
        boton.setPrefHeight(40);
        return boton;
    }

    public void mostrarInicio() {
        VBox contenido = new VBox(10);
        contenido.setAlignment(Pos.CENTER);

        Label titulo = new Label("BIENVENIDO");
        titulo.setStyle(
                "-fx-font-size: 28px; -fx-font-weight: bold;"
        );

        Label texto = new Label("Sistema de gestión de usuarios");

        contenido.getChildren().addAll(titulo, texto);
        setCenter(contenido);
    }

    public void mostrarUsuarios() {
        VBox contenido = new VBox(15);
        contenido.setPadding(new Insets(30));

        Label titulo = new Label("USUARIOS");
        titulo.setStyle(
                "-fx-font-size: 26px; -fx-font-weight: bold;"
        );

        HBox nombres = new HBox(10, txtNombre, txtApellido);
        HBox contacto = new HBox(10, txtCorreo, cboEstado);

        VBox formulario = new VBox(
                10,
                new Label("Registrar usuario"),
                nombres,
                contacto,
                btnRegistrar
        );

        contenido.getChildren().addAll(
                titulo,
                formulario,
                tablaUsuarios
        );

        setCenter(contenido);
    }

    private void crearTabla() {
        tablaUsuarios = new TableView<>();

        TableColumn<Usuario, Integer> colId =
                new TableColumn<>("ID");
        TableColumn<Usuario, String> colNombre =
                new TableColumn<>("Nombre");
        TableColumn<Usuario, String> colApellido =
                new TableColumn<>("Apellido");
        TableColumn<Usuario, String> colCorreo =
                new TableColumn<>("Correo");
        TableColumn<Usuario, String> colEstado =
                new TableColumn<>("Estado");

        colId.setCellValueFactory(
                new PropertyValueFactory<>("id")
        );
        colNombre.setCellValueFactory(
                new PropertyValueFactory<>("nombre")
        );
        colApellido.setCellValueFactory(
                new PropertyValueFactory<>("apellido")
        );
        colCorreo.setCellValueFactory(
                new PropertyValueFactory<>("correo")
        );
        colEstado.setCellValueFactory(
                new PropertyValueFactory<>("estado")
        );

        tablaUsuarios.getColumns().addAll(
                colId, colNombre, colApellido, colCorreo, colEstado
        );
    }

    public void mostrarDatosUsuarios(List<Usuario> usuarios) {
        tablaUsuarios.setItems(
                FXCollections.observableArrayList(usuarios)
        );
    }

    public Button getBtnInicio() {
        return btnInicio;
    }

    public Button getBtnUsuarios() {
        return btnUsuarios;
    }

    public Button getBtnRegistrar() {
        return btnRegistrar;
    }

    public String getNombre() {
        return txtNombre.getText().trim();
    }

    public String getApellido() {
        return txtApellido.getText().trim();
    }

    public String getCorreo() {
        return txtCorreo.getText().trim();
    }

    public String getEstado() {
        return cboEstado.getValue();
    }
}