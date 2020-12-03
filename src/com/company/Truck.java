package com.company;
public class Truck extends Vehicle {
    private String model;
    private int MPG;
    private int loadCapacity;
    private String VIN;
    private Reservation resv;

    public String getModel(){
        return model;
    }
    public int getMPG(){
        return MPG;
    }
    public int getloadcapacity(){
        return loadCapacity;
    }
    public String getVIN(){
        return VIN;
    }

    public Truck(String model, int MPG, int loadcapacity, String VIN, Reservation resv)
    {
        super(model, MPG, VIN, resv);
        this.model = model;
        this.MPG = MPG;
        this.VIN = VIN;
        this.resv = resv;
        this.loadCapacity =loadcapacity;
    }

    public Truck(String model, int MPG, int loadCapacity, String VIN) {
        super(model, MPG, VIN);
        this.loadCapacity =loadCapacity;
        this.model = model;
        this.MPG = MPG;
        this.VIN = VIN;
        this.resv = resv;
    }

    public String toString() {
        return " Model " + getModel() + " MPG " + getMPG() +  " VIN: " + getVIN() + " Load Capacity: " + getloadcapacity();
    }
}


