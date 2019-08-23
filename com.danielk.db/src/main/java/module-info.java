module com.danielk.db {

    requires java.sql;
    requires transitive com.danielk.common;

    exports com.danielk.db to com.company.common, com.danielk.ui;

}