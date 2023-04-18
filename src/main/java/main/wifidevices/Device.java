package main.wifidevices;

import javafx.beans.property.Property;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Device {
    SimpleIntegerProperty dID;
    SimpleStringProperty dName;
    SimpleStringProperty dMAC;
    SimpleStringProperty dLocation;
    SimpleStringProperty dDate;

    public Device(int dID, String dName, String dMAC, String dLocation, String dDate) {
        this.dID = new SimpleIntegerProperty(dID);
        this.dName = new SimpleStringProperty(dName);
        this.dMAC = new SimpleStringProperty(dMAC);
        this.dLocation = new SimpleStringProperty(dLocation);
        this.dDate = new SimpleStringProperty(dDate);
    }

    public Device() {
        this.dID = new SimpleIntegerProperty(0);
        this.dName = new SimpleStringProperty("null");
        this.dMAC = new SimpleStringProperty("00:00:00:00");
        this.dLocation = new SimpleStringProperty("void");
        this.dDate = new SimpleStringProperty("31/12/2222");
    }

    public void setdID(int dID) {
        this.dID.set(dID);
    }

    public void setdName(String dName) {
        this.dName.set(dName);
    }

    public void setdMAC(String dMAC) {
        this.dMAC.set(dMAC);
    }

    public void setdLocation(String dLocation) {
        this.dLocation.set(dLocation);
    }

    public void setdDate(String dDate) {
        this.dDate.set(dDate);
    }

    public Integer getdID() {
        return dID.get();
    }

    public String getdName() {
        return dName.get();
    }

    public String getdMAC() {
        return dMAC.get();
    }

    public String getdLocation() {
        return dLocation.get();
    }

    public String getdDate() {
        return dDate.get();
    }

    public Property<Integer> dIDProperty(){
        return dID.asObject();
    }

    public Property<String> dNameProperty(){
        return dName;
    }

    public Property<String> dMACProperty(){
        return dMAC;
    }

    public Property<String> dLocationProperty(){
        return dLocation;
    }

    public Property<String> dDateProperty(){
        return dDate;
    }

}
