package sonda;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public abstract class Czujnik implements CzujnikI{ 
    
    //chroniona nazwa, tak by sonda mogła bez stosowania metody
    //getName pobierać nazwy czujników
    protected String nazwa;
    public Czujnik(String nazwa){
        this.nazwa=nazwa;
    }
    
    //metoda czytaj, zwraca wyniki pomiarów
    public String czytaj(int wartosc) throws BłądCzujnika{
        String wiadomosc="";
        return(wiadomosc);
    }
    
    //Metoda toString dla klasy Czujnik
    @Override
    public String toString(){
    return(nazwa+": ");
    }
}
