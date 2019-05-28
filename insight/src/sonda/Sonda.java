package sonda;


import sonda.Czujnik;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Sonda {
    
    Czujnik czujnik1;
    Czujnik czujnik2;
    Czujnik czujnik3;
    //tablica, w której przechowywane będą czujniki sondy
    Czujnik [] czujniki;

    //konstruktor
    public Sonda(Czujnik [] czujniki){ 
        this.czujniki = czujniki;
        this.czujnik1=czujniki[0];
        this.czujnik2=czujniki[1];
        this.czujnik3=czujniki[2];

    }
    
    private int[] wczytaj(String nazwa) throws BrakPołączenia, FileNotFoundException{        
        Scanner plik;
        try {            
            // Wczytanie danych z pliku
            //plik = new Scanner(new File(nazwa));            
            plik = new Scanner(new File(nazwa), "UTF-8");            
            List<Integer> danePom = new ArrayList<>();
            while(plik.hasNextInt()){
                danePom.add(plik.nextInt());
            }
            plik.close();
            
            // Zamiana na tablicę
            int[]wyn = new int[danePom.size()];
            for(int i=0; i<danePom.size(); i++)
                wyn[i] = danePom.get(i);
            
            // Przekazanie wyniku
            return wyn;
        }
        catch(FileNotFoundException e){
            System.out.println("Brak pliku <" + nazwa + ">");
            throw new BrakPołączenia();
        }
    }
    
    
    public void działaj(int Powtorzenia) throws BrakPołączenia, FileNotFoundException, BłądCzujnika{
        //tablice na wczytane dane
        int [] daneTermiczne;
        int [] daneSejsmiczne1;
        int [] daneSejsmiczne2;
        
        //wczytanie danych
        daneSejsmiczne1 = wczytaj("S1.txt");
        daneSejsmiczne2 = wczytaj("S2.txt");
        daneTermiczne = wczytaj("T1.txt");
        
        //zmienne pomocnicze, które posłużą do przewijania wczytanych wartości
        int pomS1 = 0;
        int pomS2 = 0;
        int pomT = 0;
        
        
        //wczytywanie danych tyle razy, ile zostało zadeklarowane
        //wartości czytane są po jednej, wykorzystywana jest metoda czujnika
        for(int i=0; i<Powtorzenia; i++){

            String m1=czujnik1.czytaj(daneSejsmiczne1[pomS1]);
            String m2=czujnik2.czytaj(daneSejsmiczne2[pomS2]);
            String m3=czujnik3.czytaj(daneTermiczne[pomT]);
            //po każdym odczycie sprawdzane jest, czy wielkość tablicy nie
            //została przekroczona, jeśli tak, czytanie zaczyna się od pierwszej
            //wartości
            pomS1 += 1;
            pomS2 +=1;
            pomT += 1;
            if(pomS1>=daneSejsmiczne1.length-1){
            pomS1=0;
            }
            if(pomS2>=daneSejsmiczne2.length-1){
            pomS2=0;
            }
            if(pomT>=daneTermiczne.length-1){
            pomT=0;
            
            }
           
            //wypisanie wyników linijka po linijce
            System.out.println(i + ": "+ czujnik1 + m1 +", "+ czujnik2 +m2+", "+ czujnik3+ m3+",");    
        }
    
    
    }
    
   
}
