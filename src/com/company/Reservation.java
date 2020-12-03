package com.company;

public class Reservation {
    private String creditCardNum;
    private timeSpan rentalPeriod;
    private boolean insuranceSelected;
    private boolean reserved;
    String VIN;


    public Reservation(){

        this.creditCardNum = null;
        this.rentalPeriod = null;
        this.insuranceSelected =  false;
        this.VIN = null;
        this.reserved = true;

    }

    public Reservation(String creditCardNum, timeSpan rentalPeriod, boolean insuranceSelected, String VIN){

        this.creditCardNum = creditCardNum;
        this.rentalPeriod = rentalPeriod;
        this.insuranceSelected = insuranceSelected;
        this.VIN = VIN;
        this.reserved = true;

    }

    public String getCreditCardNum() {
        return creditCardNum;
    }

    public timeSpan getRentalPeriod(){
        return rentalPeriod;
    }

    public String getVIN(){
        return VIN;
    }

    public boolean getInsuranceSelected(){
        return insuranceSelected;
    }

    public boolean getReserved(){
        return this.reserved;
    }

    public void setReserved(boolean x){
        this.reserved = x;
    }

    public void setVIN(String VIN){
        this.VIN = VIN;
    }

    public void setCardNum(String num){
        this.creditCardNum = num;
    }

    public void setRentalPeriod(timeSpan time){
        this.rentalPeriod = time;
    }

    public void setInsuranceSelected(boolean x){
        this.insuranceSelected = x;
    }

    public String toString() {
        return getCreditCardNum()+ " " + getRentalPeriod() + " " + getInsuranceSelected() + " " + getVIN();
    }

}

