package com.seismicCalculator;

public class Numax{

    private double mass;
    private double rad;
    private double Teff;

    public Numax(double mass, double rad, double Teff){
        this.mass = mass;
        this.rad = rad;
        this.Teff = Teff;
    }

    public double calcNumax() {
        double ratioM = (mass/Constants.mass0.constant());
        double ratioR = Math.pow((rad/Constants.rad0.constant()),-2);
        double ratioT = Math.pow((Teff/Constants.Teff0.constant()),-0.5);

        return ratioM * ratioR * ratioT * Constants.numax0.constant();
    }


}
