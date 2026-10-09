package vallegrande.edu.pe.miperfil.controller;

import vallegrande.edu.pe.miperfil.model.Perfil;
import vallegrande.edu.pe.miperfil.view.PerfilView;

public class PerfilController {

    private final PerfilView view;

    public PerfilController(PerfilView view) {
        this.view = view;
        configurarEventos();
    }

    private void configurarEventos() {

        view.getBtnMostrar().setOnAction(evento -> mostrarPerfil());

        view.getBtnLimpiar().setOnAction(evento -> limpiarFormulario());
    }

    private void mostrarPerfil() {

        String nombre = view.getTxtNombre().getText().trim();
        String carrera = view.getCmbCarrera().getValue();
        String semestre = view.getCmbSemestre().getValue();

        if (nombre.isEmpty()) {
            mostrarError("Debe ingresar su nombre.");
            view.getTxtNombre().requestFocus();
            return;
        }

        if (carrera == null) {
            mostrarError("Debe seleccionar una carrera.");
            view.getCmbCarrera().requestFocus();
            return;
        }

        if (semestre == null) {
            mostrarError("Debe seleccionar un semestre.");
            view.getCmbSemestre().requestFocus();
            return;
        }

        Perfil perfil = new Perfil(nombre, carrera, semestre);

        String resultado =
                "Hola, soy " + perfil.getNombre() + "\n"
                        + "Carrera: " + perfil.getCarrera() + "\n"
                        + "Semestre: " + perfil.getSemestre();

        view.getLblMensaje().setText("");
        view.getLblResultado().setText(resultado);
    }

    private void mostrarError(String mensaje) {
        view.getLblMensaje().setText(mensaje);
        view.getLblResultado().setText("");
    }

    private void limpiarFormulario() {

        view.getTxtNombre().clear();
        view.getCmbCarrera().getSelectionModel().clearSelection();
        view.getCmbSemestre().getSelectionModel().clearSelection();
        view.getLblMensaje().setText("");
        view.getLblResultado().setText("");

        view.getTxtNombre().requestFocus();
    }
}