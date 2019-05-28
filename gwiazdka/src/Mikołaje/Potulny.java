/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mikołaje;

/**
 *
 * @author user
 */
public class Potulny extends Mikołaj{
    
    //konstruktor
    public Potulny(int ileMaks, int pojemność) {
        super(ileMaks, pojemność);
        this.typ="Potulny";
    }
    //nie przedefiniowuję metody add, bo mikołaj bierze wszystko
    
}
