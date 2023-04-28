module com.example.plumbum {
    requires javafx.controls;
    requires javafx.fxml;


    opens plumbum to javafx.fxml;
    exports plumbum;
}