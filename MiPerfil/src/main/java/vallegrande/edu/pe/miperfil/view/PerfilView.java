package vallegrande.edu.pe.miperfil.view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class PerfilView {

    private final VBox contenedor;

    private final TextField txtNombre;
    private final ComboBox<String> cmbCarrera;
    private final ComboBox<String> cmbSemestre;

    private final Button btnMostrar;
    private final Button btnLimpiar;

    private final Label lblResultado;
    private final Label lblMensaje;

    public PerfilView() {

        Label lblTitulo = new Label("MI PERFIL");
        lblTitulo.getStyleClass().add("titulo");

        Label lblNombre = new Label("Nombre:");
        Label lblCarrera = new Label("Carrera:");
        Label lblSemestre = new Label("Semestre:");

        txtNombre = new TextField();
        txtNombre.setPromptText("Ingrese su nombre");

        cmbCarrera = new ComboBox<>();
        cmbCarrera.getItems().addAll(
                "Análisis de Sistemas Empresariales",
                "Producción Agraria",
                "Gestión Administrativa"
        );
        cmbCarrera.setPromptText("Seleccione una carrera");
        cmbCarrera.setMaxWidth(Double.MAX_VALUE);

        cmbSemestre = new ComboBox<>();
        cmbSemestre.getItems().addAll(
                "Primer semestre",
                "Segundo semestre",
                "Tercer semestre",
                "Cuarto semestre",
                "Quinto semestre",
                "Sexto semestre"
        );
        cmbSemestre.setPromptText("Seleccione un semestre");
        cmbSemestre.setMaxWidth(Double.MAX_VALUE);

        btnMostrar = new Button("Mostrar perfil");
        btnMostrar.getStyleClass().add("boton-principal");

        btnLimpiar = new Button("Limpiar");
        btnLimpiar.getStyleClass().add("boton-secundario");

        HBox botones = new HBox(10, btnMostrar, btnLimpiar);
        botones.setAlignment(Pos.CENTER);

        lblMensaje = new Label();
        lblMensaje.getStyleClass().add("mensaje-error");
        lblMensaje.setWrapText(true);

        lblResultado = new Label();
        lblResultado.getStyleClass().add("resultado");
        lblResultado.setWrapText(true);
        lblResultado.setMaxWidth(Double.MAX_VALUE);

        contenedor = new VBox(
                10,
                lblTitulo,
                lblNombre,
                txtNombre,
                lblCarrera,
                cmbCarrera,
                lblSemestre,
                cmbSemestre,
                botones,
                lblMensaje,
                lblResultado
        );

        contenedor.setAlignment(Pos.CENTER_LEFT);
        contenedor.setPadding(new Insets(25));
        contenedor.getStyleClass().add("contenedor");
    }

    public VBox getContenedor() {
        return contenedor;
    }

    public TextField getTxtNombre() {
        return txtNombre;
    }

    public ComboBox<String> getCmbCarrera() {
        return cmbCarrera;
    }

    public ComboBox<String> getCmbSemestre() {
        return cmbSemestre;
    }

    public Button getBtnMostrar() {
        return btnMostrar;
    }

    public Button getBtnLimpiar() {
        return btnLimpiar;
    }

    public Label getLblResultado() {
        return lblResultado;
    }

    public Label getLblMensaje() {
        return lblMensaje;
    }
}
