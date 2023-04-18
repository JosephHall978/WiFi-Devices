package main.wifidevices.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import main.wifidevices.WiFiDevices;

import java.io.IOException;

public class MainMenuController {

    @FXML
    protected void onDeviceList() throws IOException {
        Stage stage = WiFiDevices.s;
        FXMLLoader fxmlLoader = new FXMLLoader(WiFiDevices.class.getResource("device-list.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 500, 240);
        stage.setScene(scene);
    }

    @FXML
    protected void onAddDevice() throws IOException{
        Stage stage = WiFiDevices.s;
        FXMLLoader fxmlLoader = new FXMLLoader(WiFiDevices.class.getResource("add-device.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setScene(scene);
    }

    @FXML
    protected void onEditDevice() throws IOException{
        Stage stage = WiFiDevices.s;
        FXMLLoader fxmlLoader = new FXMLLoader(WiFiDevices.class.getResource("edit-device.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setScene(scene);
    }

    @FXML
    protected void onDeleteDevice() throws IOException {
        Stage stage = WiFiDevices.s;
        FXMLLoader fxmlLoader = new FXMLLoader(WiFiDevices.class.getResource("delete-device.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setScene(scene);
    }
}