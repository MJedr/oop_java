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
public class Ostrożny extends Mikołaj{
    //konstruktor z odpowiednio zdefiniowanym typem
    public Ostrożny(int ileMaks, int pojemność) {
        super(ileMaks, pojemność);
        this.typ = "Ostrożny";
    }
    //nadpisanie metody add, tak żeby mikołaj dodawał tylko
    //prezenty gdy nie przekracza połowy pojemności worka
    @Override
    public Boolean add(Prezent pr){
        Boolean pom = true;
        if(worek.ilePrezentów()<=(worek.getPojemność()/2)){
           worek.dodaj(pr);
        }else{pom =  false;}
        return pom;
    
    }
}
