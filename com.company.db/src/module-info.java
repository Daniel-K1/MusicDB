module com.company.db {

    requires java.sql;
    requires transitive com.company.common;

    exports com.company.db to com.company.common, com.company.ui;

}