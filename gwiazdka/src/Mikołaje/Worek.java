/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mikołaje;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class Worek {
    //prywatne atrybuty worka 
    private int pojemność;
    private Prezent [] zawartość;
    //ile maksymalnie prezentów może wziąć mikołaj do worka
    private int ileMaks;
    public Worek(int ileMaks, int pojemność){
        this.pojemność=pojemność;
        this.ileMaks=ileMaks;
        zawartość = new Prezent [pojemność];
    
}   
    //metody getter do uzyskania informacji o atrybutach worka
    //zwraca całą zawartość (z pustymi miejscami)
    public Prezent [] getZawartość(){
    return zawartość;
    }
    public int getPojemność(){
    return pojemność;
    }
    //zwraca ilość prezentów w worku 
    public int ilePrezentów(){
    int zapełnienie=0;
    for(int i =0; i<zawartość.length-1; i++){
        if(zawartość[i]!=null){
        zapełnienie += 1;}
    }
    return zapełnienie;
    }
    //metoda dodawania prezentu do worka;
    //ilośc prezentów musi być mniejsza od pojemności worka
    //(a więc również mniejsza od tablicy zawartość)
    public void dodaj(Prezent pr){
    for(int i =0; i<zawartość.length-1; i++){
        if(zawartość[i]==null){
            zawartość[i]=pr;
            break;
        }
    }
    }
    //metoda wyoisująca zawartość worka (prezenty) rozdzielone przecinkami
    public String wypiszZawartość(){
        //zmienna wypisz ma przechowywać elementy do wypisania
        String wypisz = "(";
        //lista pomocnicza, przechowuje tylko prezenty
        //(nie ma pustych miejsc, które może mieć tablica zawartość)
        List<Prezent> pom = new ArrayList<Prezent>();
        //kopiowanie prezentów z tablicy zawartość
        for (Prezent p : zawartość){
            if(p != null){;
                pom.add(p);}}
        //zapisywanie elementów listy prezentów jako String rozdzielony przecinkami
        for(Prezent element: pom){
            wypisz+=element + ",";
            
        }
        //jeżeli w worku był przynajmniej jeden prezent trzeba usunąć przecinek
        //po ostatnim elementcie
        if(ilePrezentów()>=1){
        wypisz = wypisz.substring(0, wypisz.length() - 1);
        //dodanie ostatniego nawiasu
        }
        wypisz+=")";
        return wypisz;
    }

    //metoda toString w wymaganym formacie
    @Override
    public String toString(){
    return("worek{pojemność="+pojemność + ", l. prez.="+ilePrezentów()+"/"+ileMaks+" , zawartość= " + 
            wypiszZawartość()+"}");
    }
}