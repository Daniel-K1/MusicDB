module com.company.ui {

    requires com.company.db;
    requires javafx.fxml;
    requires javafx.controls;

    opens com.company.ui to javafx.fxml;

    exports com.company.ui to javafx.graphics;
}