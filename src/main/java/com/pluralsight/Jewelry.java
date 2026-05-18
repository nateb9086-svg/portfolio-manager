package com.pluralsight;

public class Jewelry extends FixedAsset {

    double karat;

    Jewelry( String name, double karat){
        super(name);
        this.karat = karat;

    }


    @Override
    double getValue(){return super.getValue();}


}
