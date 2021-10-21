module com.example.hellomodernworld {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.hellomodernworld to javafx.fxml;
    exports com.example.hellomodernworld;
}