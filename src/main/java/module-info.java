module com.example.spaceapps {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.spaceapps to javafx.fxml;
    exports com.example.spaceapps;
}