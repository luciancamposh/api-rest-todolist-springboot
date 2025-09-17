module com.example.ufupoo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ufupoo to javafx.fxml;
    exports com.example.ufupoo;
}