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
public interface MikołajI {
    //metody, które musi mieć każdy mikołaj
    Boolean add(Prezent p);
    @Override
    public String toString();
    public Prezent [] getZawartość();
    
    
}
