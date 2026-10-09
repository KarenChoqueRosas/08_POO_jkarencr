package vallegrande.edu.pe.appdesktop.controller;

import vallegrande.edu.pe.appdesktop.view.MainView;

public class MainController {

    private final MainView view;

    public MainController(MainView view) {
        this.view = view;
        configurarEventos();
    }

    private void configurarEventos() {

        view.getBtnInicio().setOnAction(e -> view.mostrarInicio());

        view.getBtnUsuarios().setOnAction(e -> view.mostrarUsuarios());

        view.getBtnProductos().setOnAction(e -> view.mostrarProductos());

        view.getBtnReportes().setOnAction(e -> view.mostrarReportes());

        view.getBtnProveedores().setOnAction(e -> view.mostrarProveedores());

        view.getBtnCategorias().setOnAction(e -> view.mostrarCategorias());
    }
}

