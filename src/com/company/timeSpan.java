package com.company;

public class timeSpan {
    private char timeUnit;
    private int numUnits;

    public timeSpan(char timeUnit, int numUnits){
        this.timeUnit = timeUnit;
        this.numUnits = numUnits;
    }

    public char getTimeUnit(){
        return this.timeUnit;
    }

    public int getNumUnits(){
        return this.numUnits;
    }

    public void setTimeUnit(char c){
        this.timeUnit = c;
    }

    public void setNumUnits(int x){
        this.numUnits = x;
    }

    public String toString(){
        return getTimeUnit() + " " + getNumUnits() ;
    }

}

