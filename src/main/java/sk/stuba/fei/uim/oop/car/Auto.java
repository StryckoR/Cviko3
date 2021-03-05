package sk.stuba.fei.uim.oop.car;

public class Auto {
    //public int one;//k tomuto sada pristupovat z ineho suboru, lebo PUBLIC
    //int two;//s tymto atributom mozes pracovat len v jednom package
    //protected int three;
    //private int four;
    private static final double FUEL_PER_KM = 0.5;//konstanta
    private double kapacitaNadrze;
    private double stavNadrze;
    private boolean neojazdene;

    //Konstruktor -> vie java automaticky generovat , je to metoda bez navr typu, ma modifikator pristupu
    public Auto(double kapacitaNadrze){//cez toto Auto vytvaras tu triedu ako keby, keby si dal private ta neide
            //typ pocet a  poraide arg v Auto sa musi lysit ak chces 2 + rozdielnych konstruktorov
        neojazdene = true;
        this.kapacitaNadrze=kapacitaNadrze;
    }
    public Auto(){
       this(100);//konstruktor vola konstruktor ten horny nech sa nam posunu jeho udaje
    }


    public void drive(double distanceInKm){
        neojazdene=false;
        stavNadrze -= distanceInKm *FUEL_PER_KM;
        if(stavNadrze<0){
            stavNadrze=0;
        }

    }

    //metody getter a setter, citaju zapisuju menia hodnoty atribut
    public double getStavNadrze(){
        return stavNadrze;
   }
   public double dotankovat(){
        double diff=kapacitaNadrze-stavNadrze;
        this.stavNadrze=kapacitaNadrze;
        return diff;
   }
    public String currentState(){
        String result;
        if(this.neojazdene){
            result ="Auto je neojazdene.";
        }else{
            result="Auto je ojazdene";
        }
        result += stavNadrze+"\\"+kapacitaNadrze;
        return result;
    }

}
