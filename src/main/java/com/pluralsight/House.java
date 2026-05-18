package com.pluralsight;

public class House extends FixedAsset{

    private int year;
    private int squareFeet;
    private int bedrooms;

    public House(String name, double value, int year, int squareFeet, int bedrooms) {
        super(name, value);
        this.year = year;
        this.squareFeet = squareFeet;
        this.bedrooms = bedrooms;
    }

    @Override
    public double getValue() {
        return super.getValue();
    }
}



