package main.wifidevices.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import main.wifidevices.WiFiDevices;

public class DeleteDevice extends DeviceList {
    @FXML
    private TextField deleteID;

    @FXML
    private void onDelete(){
        try{
            int toDelete = Integer.parseInt(deleteID.getText())-1;
            WiFiDevices.devices.remove(toDelete);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
