module com.danielk.db {

    requires java.sql;
    requires transitive com.danielk.common;
    requires org.apache.logging.log4j;
    requires org.slf4j;

    exports com.danielk.db to com.company.common, com.danielk.ui;

}