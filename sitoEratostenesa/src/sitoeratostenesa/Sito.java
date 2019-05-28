/*
Program wykonany w NetBeans 8.2. z domyslnymi argumentami [name, 10]
Autor: Marcjanna Jędrych
args: n - liczba, dla której wykoanany zostanie algorytm sita Eratostenesa
 */

package sitoeratostenesa; //klasa znajdowała się w pakiecie sitoeratostenesa
import java.util.Arrays;
import java.util.Scanner;

public class Sito {

    /**
     Moja koncepcja metody sito zakłada, że w pierwszym kroku tworzona jest 
     * tablica wartości logicznych o długości o jeden mniejszej od n (dlatego, 
     * że 0 i 1 nie bierzemy pod uwagę, ale bierzemy pod uwagę liczbę n). Tablica
     * wypełełniona jest samymi wartościami true.
     * W pętli, po kolei dla każdej liczby z zakresu sprawdzane jest, czy każda 
     * z liczb od liczby od jeden większej do n jest jej wielokrotnością (czy 
     * podzielona przez daną liczbę daje 0). Jeżeli tak, zostaje "wykreślona"
     * z tablicy - przypisana jej zostaje wartość false. Jeśli nie - liczbie 
     * wciąż przypisane jest true.
     * W ostatnim kroku indeksy wartości w tablicy są przekładane na wartości 
     * liczb z zakresu 2 do n i liczby, które miały przypisaną wartość true są
     * wypisywane jako liczby pierwsze.
     */

    public static void sito(int n) {
        boolean[] tablica = new boolean[n-1];//nowa tablica boolean na wartości od 2 do n 
        Arrays.fill(tablica, true); //wypełnienie tablicy wartościami true
        for(int i=2; i<=n; i++){ //dla każdego i od 2 do n
            if(tablica[i-2]==true){ //jeżeli odpowiadający liczbie indeks tablicy == true
                for(int j = i+1; j<=n; j++){//dla j+1 od i bo przy sprawdzaniu wielokrotności biorę tylko liczby >i
                    if((j%i==0)==true){ //jeżeli liczba jest podzielna przypisuję jej false
                    tablica[j-2]= false;
                    }
                }
            }
            else{
                    continue;
                }
                
            }
//konwersja z tablicy typu boolean do liczb
        for(int i=0; i<tablica.length; i++){
            if(tablica[i]==true){ //te liczby, którym odpowiada wartość true są pierwszymi
                System.out.println(i+2);}
        }
        
                }
                   
    public static void main(String[] args){
        //sprawdzenie, czy została podana odpowiednia ilość argumentów
        if(args.length==2){
        int n = Integer.parseInt(args[1]);
        sito(n);} //jak tak to wykonywana jest metoda sito
        else if(args.length>2){ //jak nie to przerywany jest program
        System.out.println("Podano zbyt dużo argumentów.");
        System.exit(1);
        }else if(args.length<2){
            System.out.println("Nie podano parametru n.");
            System.exit(1);
        }
    }
    }
    
