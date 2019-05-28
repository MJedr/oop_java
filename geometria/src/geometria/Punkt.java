/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometria;
import java.util.Arrays;

/**
 *
 * @author user
 */
public class Punkt {

    protected double X;
    protected double Y;   
    protected double[] wspolrzedne = new double[] {X, Y};
    
    public Punkt(double X, double Y){
    this.X = X;
    this.Y = Y;
    }
    public String toString(){
    return "(" + X + ", " + Y + ")";
   }

}
