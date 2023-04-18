package main.wifidevices.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import main.wifidevices.Device;
import main.wifidevices.WiFiDevices;
import org.controlsfx.control.GridCell;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.spi.CalendarDataProvider;

public class AddDevice {

    @FXML
    TextField nameField = new TextField();
    @FXML
    TextField macField = new TextField();
    @FXML
    TextField locationField = new TextField();

    @FXML
    public void onAddDevice(){
        String date = new SimpleDateFormat("dd/MM/yyyy").format(Calendar.getInstance().getTime());
        Device device = new Device(WiFiDevices.devices.size()+1,nameField.getText(),macField.getText(),locationField.getText(),date);
        WiFiDevices.devices.add(device);
        onClear();
    }
    @FXML
    public void onClear(){
        nameField.clear();
        macField.clear();
        locationField.clear();
    }
    @FXML
    public void onMenu() throws IOException {
        Stage stage = WiFiDevices.s;
        FXMLLoader fxmlLoader = new FXMLLoader(WiFiDevices.class.getResource("main-menu.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setScene(scene);
    }
}
