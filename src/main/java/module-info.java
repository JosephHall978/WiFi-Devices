module main.wifidevices {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires javafx.base;

    requires org.controlsfx.controls;

    opens main.wifidevices to javafx.fxml;
    exports main.wifidevices;
    exports main.wifidevices.controllers;
    opens main.wifidevices.controllers to javafx.fxml;
}