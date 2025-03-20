import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SimpleJavaFXApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Tworzymy komponenty UI
        Label label = new Label("Wpisz coś:");
        TextField textField = new TextField();
        Button button = new Button("Pokaż tekst");

        // Akcja po kliknięciu przycisku
        button.setOnAction(event -> {
            String text = textField.getText();
            label.setText("Wpisany tekst: " + text);
        });

        // Ustawienie layoutu
        VBox vbox = new VBox(10);
        vbox.getChildren().addAll(label, textField, button);

        // Ustawienie sceny
        Scene scene = new Scene(vbox, 300, 200);
        primaryStage.setTitle("Prosta Aplikacja JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
