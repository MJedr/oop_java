/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometria;

/**
 *
 * @author user
 */
public class Main {

    void testPunktu(){
    Punkt p1 = new Punkt(20.0, 10.0);
    System.out.println("Punkt 1 = " + p1);
    }
    
public void test(){
        Prostokat p1 = new Prostokat(new Punkt(0,0), new Punkt(3,3));
        Prostokat p2 = new Prostokat(new Punkt(1,1), new Punkt(4,4));
        System.out.println("p1 = " + p1 + ", p2 = " + p2);
}
    public void testProstokąta(Prostokat p, String nazwa){
        System.out.print("Prostokat " + nazwa + " = " + p + " ma pole " + p.pole() + " i ");
        if (p.pusty()){
        } else {
            System.out.print("nie ");
        }
        System.out.println("jest pusty");
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Main p = new Main();
        p.testPunktu();
        p.test();
        Prostokat p4 = new Prostokat(new Punkt(2.0, 9.0), new Punkt (8.0, 29.0));
        p.testProstokąta(p4, "ppp");
    }
    
    
}
