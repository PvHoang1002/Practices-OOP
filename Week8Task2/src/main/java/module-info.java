module com.example.week8test2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.week8test2 to javafx.fxml;
    exports com.example.week8test2;
}