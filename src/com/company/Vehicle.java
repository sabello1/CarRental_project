package com.company;

public abstract class Vehicle {
// instance variables
private String model;
private int MPG;
private String VIN;
private Reservation resv;
public abstract String toString();

// constructor
public Vehicle(String model, int MPG, String VIN, Reservation resv) {
        this.model = model;
        this.MPG = MPG;
        this.VIN = VIN;
        this.resv = resv;
}

public Vehicle(String model, int MPG, String VIN) {
        this.model = model;
        this.MPG = MPG;
        this.VIN = VIN;
}
// getters
public String getModel() {
        return model;
}

public int getMPG() {
        return MPG;
}

public String getVIN() {
        return VIN;
}

public Reservation getresv() {
        return resv;
}

// setters
public String setModel() {
        return model;
}

public int setMPG() {
        return MPG;
}

public String setVIN() {
        return VIN;
}

}

