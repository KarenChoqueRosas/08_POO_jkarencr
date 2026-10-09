module vallegrande.edu.pe.misistema {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens vallegrande.edu.pe.misistema to javafx.fxml;
    opens vallegrande.edu.pe.misistema.model to javafx.base;

    exports vallegrande.edu.pe.misistema;
}