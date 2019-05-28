

import sonda.BrakPołączenia;
import sonda.BłądCzujnika;
import sonda.Sonda;
import sonda.CzujnikTemperatury;
import sonda.Czujnik;
import sonda.CzujnikSejsmiczny;
import java.io.FileNotFoundException;



public class Main {

   public static void main(String[] args) throws FileNotFoundException, BłądCzujnika {
       try{ 
          Sonda sonda = new Sonda( new Czujnik[]{
               new CzujnikSejsmiczny("S1"),
               new CzujnikSejsmiczny("S2"),
               new CzujnikTemperatury("T1")}
           );
       
           sonda.działaj(30);
       }
       catch(BrakPołączenia w){
           System.out.println("Nie udało się utworzyć sondy");
       }
       
    }
}
