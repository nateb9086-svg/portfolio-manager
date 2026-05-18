package com.pluralsight;

public abstract class FixedAsset {


    protected String name;
    public double value;

    public void FixedAsset(String name, double value);{
        this.name = name;
        this.value = value
    }


    double getValue() {
        return value;
    }
}