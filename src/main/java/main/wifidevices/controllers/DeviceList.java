package main.wifidevices.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import main.wifidevices.WiFiDevices;

import java.io.IOException;


public class DeviceList extends FXMLDocumentController {
    @FXML
    protected void onRefresh(){
        initialize();
    }
    @FXML
    protected void onMain() throws IOException {
        Stage stage = WiFiDevices.s;
        FXMLLoader fxmlLoader = new FXMLLoader(WiFiDevices.class.getResource("main-menu.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setScene(scene);
    }
}