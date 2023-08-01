package com.sessions.session8.homework;

public class Phone {

    private int phoneSerialNumber;
    private String brand;
    private String version;
    private int memoryGB;

    public int getPhoneSerialNumber() {
        return phoneSerialNumber;
    }
    public void setPhoneSerialNumber(int phoneSerialNumber) {
        this.phoneSerialNumber = phoneSerialNumber;
    }

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getVersion() {
        return version;
    }
    public void setVersion(String version) {
        this.version = version;
    }

    public int getMemoryGB() {
        return memoryGB;
    }
    public void setMemoryGB(int memoryGB) {
        this.memoryGB = memoryGB;
    }

    public Phone(int phoneSerialNumber, String brand, String version, int memoryGB){
        this.phoneSerialNumber = phoneSerialNumber;
        this.brand = brand;
        this.version = version;
        this.memoryGB = memoryGB;
    }

}
