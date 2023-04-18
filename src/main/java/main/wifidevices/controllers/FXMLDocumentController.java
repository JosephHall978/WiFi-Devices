package main.wifidevices.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;

import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import main.wifidevices.Device;
import main.wifidevices.WiFiDevices;

import java.net.URL;
import java.util.ResourceBundle;

public class FXMLDocumentController {

    /**
     * Initializes the controller class.
     */
    @FXML
    private URL url;
    @FXML
    private ResourceBundle resources;
    @FXML
    TableView<Device> tableID = new TableView<>();
    @FXML
    TableColumn<Device, Integer> id = new TableColumn<>();
    @FXML
    TableColumn<Device, String> name = new TableColumn<>();
    @FXML
    TableColumn<Device, String> mac = new TableColumn<>();
    @FXML
    TableColumn<Device, String> loc = new TableColumn<>();
    @FXML
    TableColumn<Device, String> date = new TableColumn<>();
    int iNumber = 1;

    @FXML
    protected void initialize() {
        id.setCellValueFactory(new PropertyValueFactory<Device, Integer>("dID"));
        name.setCellValueFactory(new PropertyValueFactory<Device, String>("dName"));
        mac.setCellValueFactory(new PropertyValueFactory<Device, String>("dMAC"));
        loc.setCellValueFactory(new PropertyValueFactory<Device, String>("dLocation"));
        date.setCellValueFactory(new PropertyValueFactory<Device, String>("dDate"));
        tableID.setItems(WiFiDevices.devices);
    }
}
