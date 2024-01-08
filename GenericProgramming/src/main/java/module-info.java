module com.example.genericprogramming {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.genericprogramming to javafx.fxml;
    exports com.example.genericprogramming;
}