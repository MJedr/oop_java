/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mikołaje;

/**
 *
 * @author user
 */
public class Prezent {
    //prywatne atrybuty prezenty
    private double wielkość;
    private double waga;
    private double cena;
    
    //konstruktor
    public Prezent(double wielkość, double waga, double cena){
        this.wielkość = wielkość;
        this.waga=waga;
        this.cena=cena;
    }
    //metody getter aby uzyskać infrmację o prywatnych atrybutach obiektu
    public double getWielkość(){
        return wielkość;
}
    public double getWaga(){
        return waga;
}
    public double getCena(){
        return cena;
}
    //metoda to String w odpowiednim formacie
    @Override
    public String toString(){
    return("Prezent{wielkość=" + wielkość + ", waga="+waga+", cena="+cena+"}");
    }
}
    

