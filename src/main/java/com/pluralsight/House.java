package com.pluralsight;

public class House extends FixedAsset {
    int yearBuilt;
    int squareFeet;
    int bedrooms;

    House(int year, int squareFeet, int Bedrooms);

    @Override
    double getValue(){
        return super.getValue();
    }



}
