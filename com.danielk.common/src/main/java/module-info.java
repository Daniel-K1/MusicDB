module com.danielk.common {

    requires javafx.base;
    exports com.danielk.common;
    opens com.danielk.common to javafx.base;
}