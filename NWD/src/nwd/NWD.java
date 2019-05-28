/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nwd;

/**
 *
 * @author user
 */
public class NWD {
    int X;
    int Y;
    int dzielnik;
    NWD(int X, int Y){
    this.X = X;
    this.Y = Y;}
    public int szukaj(){
    while(X != Y){
    if(X<Y){
    dzielnik = Y-X;}
    if(X>Y){
    dzielnik = X-Y;}}
        System.out.println(dzielnik);
    return dzielnik;
    }
           

    public static void main(String[] args) {
        NWD n = new NWD(9, 18);
        n.szukaj();
    }
    
}
