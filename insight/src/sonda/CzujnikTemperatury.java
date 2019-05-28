package sonda;

import java.util.logging.Level;
import java.util.logging.Logger;


public class CzujnikTemperatury extends Czujnik{

  //dziedziczenie po klasie Czujnik
    public CzujnikTemperatury(String nazwa) {
        super(nazwa);
    }
    
    //Nadpisanie metody czytaj z charakterystycznym dla tej klasy
    //błędem zakresu
    @Override
    public String czytaj(int wartosc) throws BłądZakresu{
    String wiadomosc = "";
       try{
        if(wartosc>=-160&wartosc<=40){
        wiadomosc=Integer.toString(wartosc);
        //System.out.println(nazwa+ " : " +wartosc);
    }
    else{
        throw new BłądZakresu("B_Zakr"); //błąd zakresu zwraca informację o treści "B_Zakr"
            }}
    catch(BłądZakresu b){
        wiadomosc=b.getMessage();
    }
       return(wiadomosc);
    }

            
}

