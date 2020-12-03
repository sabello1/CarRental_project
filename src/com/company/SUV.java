package com.company;

public class SUV extends Vehicle
{
    private String model;
    private int MPG;
    private String VIN;
    private int CargoCapacity;
    private int SeatingCapacity;
    private Reservation resv;

    public String getModel(){
        return model;
    }
    public int getMPG(){
        return MPG;
    }
    public int getCargoCapacity(){
        return CargoCapacity;
    }
    public int getSeatingCapacity(){ return SeatingCapacity;
    }
    public String getVIN(){
        return VIN;
    }

    public SUV(String model, int MPG, int seatingcapacity, int cargocapacity, String VIN, Reservation resv)
    {
        super(model, MPG, VIN, resv);
        this.model = model;
        this.MPG = MPG;
        this.VIN = VIN;
        this.resv = resv;
        this.CargoCapacity = cargocapacity ;
        this.SeatingCapacity = seatingcapacity;
    }


    public SUV(String model, int MPG, int seatingcapacity, int cargocapacity, String VIN)
    {
        super(model, MPG, VIN);
        this.CargoCapacity = cargocapacity;
        this.SeatingCapacity = seatingcapacity;
        this.model = model;
        this.MPG = MPG;
        this.VIN = VIN;
        this.resv = resv;
    }

    public String toString()
    {
        return "Model " + getModel() + " MPG " + getMPG() + " VIN: " + getVIN() + " Cargo Capacity: " + getCargoCapacity() + " Seating Capacity " + getSeatingCapacity();
    }
}
