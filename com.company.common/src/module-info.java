module com.company.common {

    requires javafx.base;

    exports com.company.common;
    opens com.company.common to javafx.base;
}