/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package przesuniecie;
import java.util.Arrays;
public class Main {

    public static void lustro(int[] tablica){
        // można dwie zmienne w jednej pętli, ale zmienne tego samego typu
        for(int lewy=0, prawy=tablica.length-1;lewy<prawy; lewy++, prawy--){
            int tmp = tablica[lewy];
            tablica[lewy]=tablica[prawy];
            tablica[prawy]=tmp;
            
        }
    }
    
        public static void wypisz(int[] tablica){
            for(int i=0; i<tablica.length ; i++){
                System.out.print(tablica[i]+", ");
            }
        }
        public static void ini(int[] tablica){
            for(int i=0; i<tablica.length ; i++){
                tablica[i]=i;   
            }
            System.out.println(Arrays.toString(tablica));
        }
        
         public static void przesun(int[] tablica){
            int ziemniak = tablica[0];
            for(int i=1; i<tablica.length ; i--){
                int pom = ziemniak;
                ziemniak = tablica[i];
                tablica[i] = pom;
            }
            tablica[0]= ziemniak;
            System.out.println(Arrays.toString(tablica));
        }       
            public int [] przesunWLewo(int[] tablica){
            int ziemniak = tablica[tablica.length -1];
            for(int i=tablica.length -2; i>=0 ; i--){
                int pom = ziemniak;
                ziemniak = tablica[i];
                tablica[i] = pom;
            }
            tablica[tablica.length - 1]= ziemniak;
            return tablica;
        }       

    public static void main(String[] args) {
        int[] tab = new int[10];
        ini(tab);

    }
    
}
