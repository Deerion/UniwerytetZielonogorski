module com.example.aplikacja {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;

    // Otwórz pakiet dla javafx.fxml, jeśli masz kontrolery FXML w tym pakiecie
    opens com.example.aplikacja to javafx.fxml;

    // Eksportuj pakiet, aby inne moduły mogły z niego korzystać
    exports com.example.aplikacja;
}
