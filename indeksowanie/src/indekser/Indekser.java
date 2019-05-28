/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package indekser;

import filtry.BrakPliku;
import filtry.Filtr;
import filtry.FiltrLiterki_txt;
import filtry.Filtr_txt;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class Indekser {
    
    String nazwaPliku;
    List <String> źródła;
    Set<String> zestawSłów;
    List<String> listaSłów;
    Map<String, List<String>> mapaSłów;
    
    
    public Indekser(){
        this.źródła = new ArrayList<>();
        this.mapaSłów = new HashMap<>();
        this.listaSłów = new ArrayList<>();
    }
    
    
    public void wczytajDane(String string, Filtr filtr) throws BrakPliku{
        String nazwa = string.substring(string.indexOf(File.separator)+1);
        this.nazwaPliku = nazwa;
        źródła.add(nazwaPliku);
        filtr.otwórz_plik(string);
        List<String> wszystkieSłowa = new ArrayList<>();

        while(filtr.czyJestNastępny()){
            String słówko = filtr.dajSłowo();
            wszystkieSłowa.add(słówko); // slowa dla konkretnego pliku
            listaSłów.add(słówko); // słowa ze wszystkich plików
        }
        mapaSłów.put(nazwaPliku, wszystkieSłowa);
    }

    
    public List<String> dajPlikiZeSłowem(String słowo) {
        List<String> plikiZeSłowem = new ArrayList<>();
        for(Map.Entry<String, List<String>> entry : mapaSłów.entrySet()){ 
            String key = entry.getKey();
            List<String> value = entry.getValue();
            if(value.contains(słowo)){
                plikiZeSłowem.add(key);
            }
        }
        return(plikiZeSłowem);
    }
   
    
    public List<String> dajPlikiZeSłowami(List<String> zbiórSłów) {
        List<String> plikiZeSłowami = new ArrayList<>();
        for(Map.Entry<String, List<String>> entry : mapaSłów.entrySet()){
            String key = entry.getKey();
            List<String> value = entry.getValue();
            if(value.containsAll(zbiórSłów)){
                System.out.println(key);
                plikiZeSłowami.add(key);
            } 
    }
        return(plikiZeSłowami);
    }
    
    
    public String dajNazwePliku(){
        return(nazwaPliku);
    }

    
    public List<String> jakieŻródła() {
       return źródła;
    }
    
    
    // podaje liczbę unikalnych slow
    public int ileSłów(){
        int łącznaLiczbaSłów = 0;
        zestawSłów = new HashSet<>(listaSłów);
        return(zestawSłów.size());
    }

    
    public int wIluPlikach(String słowo) {
        int wIluPlikach = 0;
        for(Map.Entry<String, List<String>> entry : mapaSłów.entrySet()){
            String key = entry.getKey();
            List<String> value = entry.getValue();
            if(value.contains(słowo)){
                wIluPlikach+=1;
            }
    }
        return wIluPlikach;
    }
    
}
