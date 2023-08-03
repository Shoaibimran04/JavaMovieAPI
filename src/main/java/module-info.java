module com.example.javamovieapi {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javamovieapi to javafx.fxml;
    exports com.example.javamovieapi;
}