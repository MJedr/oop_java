/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sonda;

/**
 *
 * @author user
 */
public interface CzujnikI {
    
    public String czytaj(int wartosc) throws BłądCzujnika, BłądZakresu, BłądOdczytu;
    
    @Override
    public String toString();
    
}
