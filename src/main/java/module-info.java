module com.di.proyectofinal {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.di.proyectofinal to javafx.fxml;
    exports com.di.proyectofinal;
}