module com.example.javamovieapi {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.net.http;
    requires com.google.gson;


    opens com.example.javamovieapi to javafx.fxml;
    exports com.example.javamovieapi;
}