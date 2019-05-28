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
public class Schorowany extends Mikołaj{
    
    public Schorowany(int ileMaks, int pojemność) {
        super(ileMaks, pojemność);
        this.typ = "Schorowany";
    }
    //przedefiniowana metoda add 
    //- mikołaj bierze jako pierwszy prezent każdy, 
    //a jako następny tylko ten, który jest lżejszy od poprzedniego
    @Override
    public Boolean add(Prezent pr){
        Boolean pom = false;
        if(worek.ilePrezentów()==0){
            worek.dodaj(pr);
            pom = true;}
        else{
            //indeksowanie tablicy zawartość - wybieranie indeksu ostatniego prezentu.
            //sprawdzenie jego wagi i porównanie z wagą rozpatrywanego prezentu
            if(worek.getZawartość()[worek.ilePrezentów()-1].getWaga()>pr.getWaga()){
            worek.dodaj(pr);
            pom = true;}

        }
        return pom;
    }
}
