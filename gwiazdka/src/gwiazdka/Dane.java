/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gwiazdka;
import Mikołaje.Prezent;
import Mikołaje.Mikołaj;
import java.util.Arrays;

/**
 *
 * @author user
 */
public class Dane {
    Prezent [] prezenty;
    Mikołaj [] mikołaje;
    public Dane(Prezent[] prezenty, Mikołaj [] mikołaje){
        this.prezenty=prezenty;
        this.mikołaje = mikołaje;
    }

    public Mikołaj [] mikołaje(){
        return mikołaje;
    }
    public Prezent [] prezenty(){
        return prezenty;
    }
    //metoda przesuwająca tablicę mikołajów w lewo o jeden
    public Mikołaj [] przesuń(){
            Mikołaj ziemniak = mikołaje[mikołaje.length -1];
            for(int i=mikołaje.length -2; i>=0 ; i--){
                Mikołaj pom = ziemniak;
                ziemniak = mikołaje[i];
                mikołaje[i] = pom;
            }
            mikołaje[mikołaje.length - 1]= ziemniak;
            return mikołaje;
        }       
    

    @Override
    public String toString(){
    return ("Dane{ \nprezenty="+Arrays.toString(prezenty)+"\nmikołaje = " + Arrays.toString(mikołaje));

    }
}
