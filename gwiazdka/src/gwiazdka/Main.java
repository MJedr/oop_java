/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gwiazdka;
import Mikołaje.Prezent;
import Mikołaje.Schorowany;
import Mikołaje.Skromny;
import Mikołaje.Mikołaj;
import Mikołaje.Wybredny;
import Mikołaje.Potulny;
import Mikołaje.Ostrożny;
import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;
import java.io.FileNotFoundException;
/**
 *
 * @author user
 */
public class Main {
    

    Dane wczytajDane(String nazwa) {
        try {
            Scanner dane = new Scanner(new File(nazwa), "UTF-8");

            // Czytam prezenty, kończą się pustym wierszem

            ArrayList<Prezent> prezenty = new ArrayList<Prezent>();

            int nrWiersza = 0;
            int ileP = 0;
            String napis;
            while (dane.hasNextLine() && ((napis = dane.nextLine()).length() > 0)) {
                nrWiersza++;
                Scanner wiersz = new Scanner(napis);

                assert wiersz.hasNextInt() : "Brak wielkości prezentu w wierszu: " + nrWiersza + ": " + wiersz;
                int wielkość = Integer.parseInt(wiersz.next());

                assert wiersz.hasNextInt() : "Brak wagi prezentu w wierszu: " + nrWiersza + ": " + wiersz;
                int waga = Integer.parseInt(wiersz.next());

                assert wiersz.hasNextInt() : "Brak ceny prezentu w wierszu: " + nrWiersza + ": " + wiersz;
                int cena = Integer.parseInt(wiersz.next());

                prezenty.add(new Prezent(wielkość, waga, cena));
            } // while

            ileP = nrWiersza;
            nrWiersza++; //Pusry wiersz

            System.out.println("Liczba wczytanych prezentów: " + ileP);

            // Czytam Mikołajów

            ArrayList<Mikołaj> mikołaje = new ArrayList<Mikołaj>();

            while (dane.hasNextLine()) {
                nrWiersza++;
                Scanner wiersz = new Scanner(dane.nextLine());

                assert wiersz.hasNext(".") : "Brak kodu Mikołaja w wierszu: " + nrWiersza + ": " + wiersz;
                String kod = wiersz.next();

                assert wiersz.hasNextInt() : "Brak maksymalnej liczby prezentów mieszczących się w worku w wierszu: " + nrWiersza + ": " + wiersz;
                int ileMaks = Integer.parseInt(wiersz.next());

                assert wiersz.hasNextInt() : "Brak pojemności worka w wierszu: " + nrWiersza + ": " + wiersz;
                int pojemność = Integer.parseInt(wiersz.next());

                switch (kod) {
                    case "P":
                        mikołaje.add(new Potulny(ileMaks, pojemność));
                        break;       
                    case "O":
                        mikołaje.add(new Ostrożny(ileMaks, pojemność));
                        break;
                    case "S":
                        mikołaje.add(new Schorowany(ileMaks, pojemność));
                        break;
                    case "B":
                        mikołaje.add(new Skromny(ileMaks, pojemność));
                        break;
                    case "W":
                        mikołaje.add(new Wybredny(ileMaks, pojemność));
                        break;
                    // ...  pozostali Mikołajowie ...
                    default:
                        assert false : "Niepoprawny kod Mikołaja w wierszu: " + nrWiersza + ": " + wiersz;
                } // switch
            } // while

            int ileM = nrWiersza - ileP - 1;
            System.out.println("Liczba wczytanych Mikołajów: " + ileM);

            return new Dane(prezenty.toArray(new Prezent[0]), mikołaje.toArray(new Mikołaj[0]));

        } catch (FileNotFoundException e) {
            assert false : "Nie można otworzyć pliku: " + nazwa;
            return null; // Tylko dla spokoju ducha kompilatora, nigdy tu nie dojdziemy (przy -ea)
        }}

        //rozdzielenie prezentów, wykorzystuje fakt, że metoda add zwraca true lub false
        public void rozdziel(Dane dane){
            int pom = 0;
            //każdy prezent oferowany jest po kolei mikołajom
            for(int i = 0; i<dane.prezenty().length; i++){
                for(Mikołaj m: dane.mikołaje()){
                    //metoda add dla kolejnego mikołaja na liście
                    Boolean test = m.add(dane.prezenty[i]);
                    //jeśli nie wziął,najpierw sprawdzane jest, które to 
                    // "niewzięcie" z kolei (wartość pom) - jeśli każdy z mikołajów odmówił,
                    //pojawia się komunikat, tablica jest przesuwana o jeden i zaczyna
                    //się rozdanie nowego prezentu
                    if(test==false){
                        pom +=1;
                        if(pom == dane.mikołaje().length){;
                        System.out.println("Nikt nie wziął prezentu: " + dane.prezenty()[i]);
                        dane.przesuń();
                        pom = 0;
                        break;
                    //jeśli jednak nie każdy odmówił, prezent oferowany jest dalej
                    }else{
                        continue;}}
                    //jeżeli wartość zwrócona przez metodę add to true, tablica jest przesuwana,
                    //a zmienna pom zostaje wyzerowana
                    else{dane.przesuń();
                        pom = 0;
                    break;
                    }
                    }
                }
            }
        
       public static void main(String[] args) {

        Main m = new Main();

        System.out.println("*** Początek programu - wczytywanie danych ***\n");

        Dane dane = m.wczytajDane("dane0.txt");

        System.out.println("\n*** Po wczytaniu danych, dane = ***\n\n" + dane + "\n");

        m.rozdziel(dane);

        System.out.println("\n*** Mikołaje po podziale prezentów ***\n");
        for(Mikołaj mik: dane.mikołaje())
            System.out.println(mik);

        System.out.println("\n*** Koniec programu ***");
        


}


}
