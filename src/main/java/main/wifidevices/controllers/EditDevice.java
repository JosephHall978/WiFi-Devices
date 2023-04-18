package main.wifidevices.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import main.wifidevices.WiFiDevices;

public class EditDevice extends AddDevice {
    @FXML
    TextField editID = new TextField();

    @FXML
    private void onEdit(){
        try {
            int index = Integer.parseInt(editID.getText())-1;
            if (!(nameField.getText()).isBlank()) {
                WiFiDevices.devices.get(index).setdName(nameField.getText());
            }
            if (!(macField.getText()).isBlank()) {
                WiFiDevices.devices.get(index).setdMAC(macField.getText());
            }
            if (!(locationField.getText()).isBlank()) {
                WiFiDevices.devices.get(index).setdLocation(locationField.getText());
            }
            onClear();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
