module com.example.concesionario_oltra {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.concesionario_oltra to javafx.fxml;
    exports com.example.concesionario_oltra;
}