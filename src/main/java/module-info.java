module com.example.avaliacao {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.avaliacao to javafx.fxml;
    exports com.example.avaliacao;
}