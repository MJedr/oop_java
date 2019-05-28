/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import geometria.*;

public class Main {

    public void testProstokąta(Prostokąt p, String nazwa){
        System.out.print("Prostokąt " + nazwa + " = " + p + " ma pole " + p.pole() + " i ");
        if (!p.pusty()){
            System.out.print("nie ");
        }
        System.out.println("jest pusty");
    }

    public void test(){
        Prostokąt p1 = new Prostokąt(new Punkt(0,0), new Punkt(3,3));
        Prostokąt p2 = new Prostokąt(new Punkt(1,1), new Punkt(4,4));
        System.out.println("p1 = " + p1 + ", p2 = " + p2);
        testProstokąta(p1.przecięcie(p2), "część wspólna");
        p1.przesuń(4,4);
        System.out.println("p1 = " + p1 + ", p2 = " + p2);
        testProstokąta(p1.przecięcie(p2), "druga część wspólna");
        p2.przesuń(-1,-1);
        System.out.println("p1 = " + p1 + ", p2 = " + p2);
        testProstokąta(p1.przecięcie(p2), "trzecia część wspólna");
    }

    public static void main(String[] args) {
     Main m = new Main();
     m.test();
    }
}