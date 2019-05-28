/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mikołaje;

import Mikołaje.Mikołaj;

/**
 *
 * @author user
 */
public class Skromny extends Mikołaj{
    

    public Skromny(int ileMaks, int pojemność) {
        super(ileMaks, pojemność);
        this.typ="Skromny";
    }
    //przedefiniowana metoda add, mikołaj bierze tylko te prezenty
    //których stosunek ceny do wielkości jest większy od 10 i póki
    //mieszczą się w worku
    @Override
    public Boolean add(Prezent pr){
        Boolean pom = false;
        double stosunekCW=pr.getCena()/pr.getWielkość();
        if(worek.ilePrezentów()<ileMaks&stosunekCW>10){
            worek.dodaj(pr);
            pom = true;
    }
        return pom;
}
}
