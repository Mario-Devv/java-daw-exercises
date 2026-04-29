package com.example.concesionario_oltra;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MiConcesioario extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MiConcesioario.class.getResource("ConcesionarioOltra.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 610);
        stage.setTitle("Concesionario Oltra");
        stage.setScene(scene);
        stage.show();
    }
}
