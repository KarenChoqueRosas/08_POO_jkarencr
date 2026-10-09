package vallegrande.edu.pe.miperfil;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import vallegrande.edu.pe.miperfil.controller.PerfilController;
import vallegrande.edu.pe.miperfil.view.PerfilView;

import java.util.Objects;

public class Main extends Application {

    @Override
    public void start(Stage stage) {

        PerfilView view = new PerfilView();
        new PerfilController(view);

        Scene scene = new Scene(view.getContenedor(), 500, 520);

        String css = Objects.requireNonNull(
                getClass().getResource(
                        "/vallegrande/edu/pe/miperfil/styles.css"
                )
        ).toExternalForm();

        scene.getStylesheets().add(css);

        stage.setTitle("Mi perfil");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}