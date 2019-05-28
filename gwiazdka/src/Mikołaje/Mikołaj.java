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
public abstract class Mikołaj implements MikołajI{
    //atrybuty chronione - klasy dziedziczące musza mieć do nich dostęp
    protected int ileMaks;
    protected Worek worek;
    protected String typ;

    //konstruktor
    public Mikołaj(int ileMaks, int pojemność){
        this.worek=new Worek(ileMaks, pojemność);
        this.ileMaks = ileMaks;

    }
    //zdefiniowanie metody z interfejsu
    //domyślnie mikołaj bierze prezenty póki mieszczą
    //mu się w worku (tak zrobiłby każdy normalny mikołaj)
    //metoda zwraca false jeśli mikołaj nie wziął prezentu,
    //jeśli wziął - true
    @Override
    public Boolean add(Prezent pr){
        Boolean pom = false;
        if(worek.ilePrezentów()<ileMaks){
            worek.dodaj(pr);
            pom = true;}
        return pom;
    }
    //getter - wypisanie zawartości worka
    @Override
    public Prezent [] getZawartość(){
        return worek.getZawartość();}
    
    //wypisanie mikołaja w wymaganym formacie
    @Override
    public String toString(){
    return("Mikołaj{"+ typ +", " + worek + "}");
    }
    
}
