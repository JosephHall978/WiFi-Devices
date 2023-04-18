package main.wifidevices;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class WiFiDevices extends Application {
    public static Stage s;
    public static final ObservableList<Device> devices =
            FXCollections.observableArrayList();
    @Override
    public void start(Stage stage) throws IOException {
        s = stage;
        FXMLLoader fxmlLoader = new FXMLLoader(WiFiDevices.class.getResource("main-menu.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("WiFi Devices");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}