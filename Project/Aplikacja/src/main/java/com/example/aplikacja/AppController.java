package com.example.aplikacja;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class AppController {

    @FXML
    private Label label;

    @FXML
    private TextField textField;

    // Metoda, która zmienia tekst etykiety po kliknięciu przycisku
    @FXML
    private void onButtonClick() {
        String text = textField.getText();
        label.setText("Wpisany tekst: " + text);
    }
}
