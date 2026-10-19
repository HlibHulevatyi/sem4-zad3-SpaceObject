module com.example.sem4zad3spaceobject {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.sem4zad3spaceobject to javafx.fxml;
    exports com.example.sem4zad3spaceobject;
}