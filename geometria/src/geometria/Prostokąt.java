/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometria;


public class Prostokąt {
    private Punkt p1;
    private Punkt p2;
    
    public Prostokąt(Punkt p1, Punkt p2){
        this.p1 = p1;
        this.p2 = p2;
    }
    public void przesuń(int dX, int dY){
        p1.X = p1.X + dX;
        p1.Y = p1.Y + dY;
        p2.X = p2.X + dX;
        p2.Y = p2.Y + dY;
    }
 
    public double pole(){
        double pole;
        double deltaY = p2.Y - p1.Y; //założenie - p1 jest lewą dolną współrzędną
        double deltaX = p2.X - p1.X; //założenie - p1 jest lewą dolną współrzędną
        if(deltaX<0 | deltaY<0){pole = 0;} //każdy 'pusty' prostokąt - pole 0
        else{pole = deltaY*deltaX;}
        {return pole;}
    }
    public boolean pusty(){
        return ((p1.X > p2.X) & (p1.Y>p2.Y));
    }
    public Prostokąt przecięcie(Prostokąt P2){
        Prostokąt przecięcie; 

        przecięcie = new Prostokąt(new Punkt(Math.max(p1.X, P2.p1.X), 
                Math.max(p1.Y, P2.p1.Y)), 
                new Punkt (Math.min(p2.X, P2.p2.X), 
                Math.min(p2.Y, P2.p2.Y)));
        {return przecięcie;}
        }
        @Override //nadpisanie metody klasy Object
        public String toString(){
        return "Prostokąt[" + p1 + p2+ "]";
   }
    }
