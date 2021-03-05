package sk.stuba.fei.uim.oop.car;

public class Auto {
    //public int one;//k tomuto sada pristupovat z ineho suboru, lebo PUBLIC
    //int two;//s tymto atributom mozes pracovat len v jednom package
    //protected int three;
    //private int four;
    private static final double FUEL_PER_KM = 0.5;//konstanta
    private double kapacitaNadrze;
    private double stavNadrze;

    public void drive(double distanceInKm){
        stavNadrze -= distanceInKm *FUEL_PER_KM;
        if(stavNadrze<0){
            stavNadrze=0;
        }

    }

    //metody getter a setter, citaju zapisuju menia hodnoty atribut
    public double getStavNadrze(){
        return stavNadrze;
    }
    public void setStavNadrze(double stavNadrze){
        this.stavNadrze=stavNadrze;
    }

}
