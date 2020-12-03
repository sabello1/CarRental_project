package com.company;

public class Car extends Vehicle {
    private String model;
    private int MPG;
    private int seatingCapacity;
    private String VIN;
    private Reservation resv;


    public String getModel(){
        return this.model;
    }
    public int getMPG(){
        return this.MPG;
    }

    public int getSeatingCapacity(){
        return this.seatingCapacity;
    }
    public String getVIN(){
        return this.VIN;
    }

    public String toString(){
        return "Model: " + this.model + " MPG: " + getMPG() + " Seating capacity: " + getSeatingCapacity() + " VIN: " + getVIN();
    }
    public Car(String model, int MPG,int seatingcapacity, String VIN, Reservation resv)
    {
        super(model, MPG, VIN, resv);
        this.model = model;
        this.MPG = MPG;
        this.VIN = VIN;
        this.resv = resv;
        this.seatingCapacity = seatingcapacity;
    }

    public Car(String model, int MPG,int seatingcapacity, String VIN)
    {
        super(model, MPG, VIN);
        this.model = model;
        this.MPG = MPG;
        this.VIN = VIN;
        this.resv = resv;
        this.seatingCapacity = seatingcapacity;
    }

}


