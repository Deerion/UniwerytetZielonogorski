package com.example.lab_12a;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class HelloController {
    @FXML private TextField firstNameField, lastNameField, companyField, positionField, streetField, cityField, postalCodeField, stateField, countryField, phoneField, emailField, websiteField;
    @FXML private TextArea notesArea;
    @FXML private ImageView imageView;

    @FXML
    private void handleUploadImage(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("Image Files", "*.png", "*.jpg", "*.jpeg"));
        File file = fileChooser.showOpenDialog(null);
        if (file != null) {
            Image image = new Image(file.toURI().toString());
            imageView.setImage(image);
        }
    }

    @FXML
    private void handleSave(ActionEvent event) {
        try (FileWriter writer = new FileWriter("dane.txt", true)) {
            writer.write("Ogólne: \n");
            writer.write("Imię: " + firstNameField.getText() + "\n");
            writer.write("Nazwisko: " + lastNameField.getText() + "\n");
            writer.write("Miejsce zatrudnienia: " + companyField.getText() + "\n");
            writer.write("Stanowisko: " + positionField.getText() + "\n");

            writer.write("Dane adresowe: \n");
            writer.write("Ulica: " + streetField.getText() + "\n");
            writer.write("Miasto: " + cityField.getText() + "\n");
            writer.write("Kod pocztowy: " + postalCodeField.getText() + "\n");
            writer.write("Województwo: " + stateField.getText() + "\n");
            writer.write("Kraj: " + countryField.getText() + "\n");

            writer.write("Dane kontaktowe: \n");
            writer.write("Nr. telefonu: " + phoneField.getText() + "\n");
            writer.write("Email: " + emailField.getText() + "\n");
            writer.write("Strona www: " + websiteField.getText() + "\n");
            writer.write("Uwagi: " + notesArea.getText() + "\n");
            writer.write("---------------------------\n");

            // Display success alert
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "Data saved successfully!", ButtonType.OK);
            alert.showAndWait();
        } catch (IOException e) {
            e.printStackTrace();
            // Display error alert
            Alert errorAlert = new Alert(Alert.AlertType.ERROR, "Failed to save data!", ButtonType.CLOSE);
            errorAlert.showAndWait();
        }
    }
}
