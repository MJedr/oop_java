/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometria;
import geometria.Punkt;
import java.util.Arrays;

/**
 *
 * @author user
 */
public class Prostokat {
    private Punkt p1;
    private Punkt p2;
    private String nazwa;
    
    public Prostokat(Punkt p1, Punkt p2){
//        this.nazwa = nazwa;
        this.p1 = p1;
        this.p2 = p2;
    }
    public void przesun(int dX, int dY){
    p1.X = p1.X + dX;
    p1.Y = p1.Y + dY;
    p2.X = p2.X + dX;
    p2.Y = p2.Y + dY;
    }
 
    public double pole(){
    double deltaY = Math.max(p1.Y,p2.Y) - Math.min(p1.Y, p2.Y);
    double deltaX = Math.max(p1.X,p2.X) - Math.min(p1.X, p2.X);
    double pole = deltaY*deltaX;
    {return pole;}
    }
    public boolean pusty(){
    return ((p1.X > p2.X) & (p1.Y>p2.Y));
    }
    public Prostokat przecięcie(Prostokat P2){
    Prostokat przecięcie;

    przecięcie = new Prostokat(new Punkt(Math.max(p1.X, P2.p1.X), 
            Math.max(p1.Y, P2.p1.Y)), new Punkt (Math.min(p2.X, P2.p2.X), 
            Math.min(p2.Y, P2.p2.Y)));
    {return przecięcie;}
    }
    @Override
    public String toString(){
    return "Prostokąt " + p1 + p2;
   }
    }
