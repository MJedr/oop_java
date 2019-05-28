/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gwiazdka;

import Mikołaje.Worek;
import Mikołaje.Prezent;
import Mikołaje.Mikołaj;
import Mikołaje.Potulny;

/**
 *
 * @author user
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mikołaj m = new Potulny(2, 9);
        System.out.println(m);
        Prezent p= new Prezent(1,2,3);
        m.add(p);
        Worek w = new Worek(8,10);
        System.out.println(w);
        Prezent pa = new Prezent(10,10, 10);
        m.add(pa);
        System.out.println(m);
    }
    
}
