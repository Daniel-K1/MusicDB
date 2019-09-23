module com.danielk.ui {

    requires com.danielk.db;

    requires javafx.fxml;
    requires javafx.graphics;
    requires javafx.controls;
    requires org.apache.logging.log4j;

    opens com.danielk.ui to javafx.fxml;

    exports com.danielk.ui to javafx.graphics;
}