module com.example.lab_12a {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.lab_12a to javafx.fxml;
    exports com.example.lab_12a;
}