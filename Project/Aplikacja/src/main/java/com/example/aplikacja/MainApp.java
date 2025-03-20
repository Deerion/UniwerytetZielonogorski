package com.example.aplikacja;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApp extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        // Ładowanie pliku FXML
        FXMLLoader fxmlLoader = new FXMLLoader(MainApp.class.getResource("/com/example/aplikacja/app-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 300, 200);

        // Ustawienie sceny i tytułu okna
        stage.setTitle("Zmiana Tekstu w JavaFX");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
