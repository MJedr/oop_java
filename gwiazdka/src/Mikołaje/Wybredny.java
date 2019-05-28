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
public class Wybredny extends Mikołaj{
    
    //konstruktor 
    public Wybredny(int ileMaks, int pojemność) {
        super(ileMaks, pojemność);
        this.typ="Wybredny";
    }
    @Override
    //nadpisanie metody add, mikołaj bierze tylko te prezenty,
    //dla których stosunek wagi do wielkości jest mniejszy od 1
    //i póki mieszczą mu się prezenty w worku
    public Boolean add(Prezent pr){
        Boolean pom = false;
        double stosunekWW=pr.getWaga()/pr.getWielkość();
        if(worek.ilePrezentów()<ileMaks&stosunekWW<1){
            worek.dodaj(pr);
            pom = true;
    }
        return pom;
    }
}

