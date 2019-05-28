/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gwiazdka;

import Mikołaje.Prezent;
import Mikołaje.Schorowany;
import Mikołaje.Skromny;
import Mikołaje.Mikołaj;
import Mikołaje.Wybredny;
import Mikołaje.Potulny;
import Mikołaje.Ostrożny;

/**
 *
 * @author user
 */
public class Gwiazdka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Prezent p = new Prezent(19, 9, 1);
        Prezent z = new Prezent(1,10, 16);
        Prezent j = new Prezent(1,1, 16);
        System.out.println(p);
        Mikołaj m = new Potulny(3, 5);
        System.out.println(m);
    }
    
}
