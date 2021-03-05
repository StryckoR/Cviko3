package sk.stuba.fei.uim.oop.car;

public class Auto {
    public int pocetKolies;
    public int pocetDvery;
    public double kapacitaNadrze;
    public String nazov;

    public int one;//k tomuto sada pristupovat z ineho suboru, lebo PUBLIC
    int two;//s tymto atributom mozes pracovat len v jednom package
    protected int three;
    private int four;

}
