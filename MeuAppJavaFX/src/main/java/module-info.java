module com.mycompany.meuappjavafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.meuappjavafx to javafx.fxml;
    exports com.mycompany.meuappjavafx;
}
