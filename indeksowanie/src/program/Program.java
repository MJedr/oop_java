
package program;

import filtry.BrakPliku;
import indekser.Indekser;
import filtry.Filtr;
import filtry.Filtr_txt;
import filtry.FiltrLiterki_txt;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author user
 */
public class Program {

    void test_indekser(Indekser ind) {
        List<String> słowaPojedyncze = Arrays.asList("rok", "pani", "noc", "księżyca", "spoziera", "");
        List<String> zbiórSłów = Arrays.asList("na", "król");
        System.out.println("---  Start testu --- ");
        System.out.println(String.format("Zindeksowano %s plików oraz %s słów",
                ind.jakieŻródła().size(), ind.ileSłów()));
        System.out.println("Spis źródeł:" + ind.jakieŻródła());
        for (String słowo : słowaPojedyncze) {
            System.out.println("Słowo '" + słowo + "' występuje w "
                    + ind.wIluPlikach(słowo) + ": " + ind.dajPlikiZeSłowem(słowo));
        }
        System.out.println("Pliki ze wszystkimi słowami (" + zbiórSłów
                + "): " + ind.dajPlikiZeSłowami(zbiórSłów));
        System.out.println("---  Koniec testu --- ");
    }
    void test(Indekser ind, Filtr filtr) {
        try {
            test_indekser(ind);
            ind.wczytajDane("dane"+File.separator+"pan-tadeusz.txt", filtr);
            ind.wczytajDane("dane"+File.separator+"reduta-ordona.txt", filtr);
            test_indekser(ind);
            ind.wczytajDane("dane"+File.separator+"ballady-i-romanse-pani-twardowska.txt", filtr);
            ind.wczytajDane("dane"+File.separator+"ballady-i-romanse-rekawiczka.txt", filtr);
            ind.wczytajDane("dane"+File.separator+"ballady-i-romanse-switezianka.txt", filtr);
            test_indekser(ind);
        } catch (BrakPliku wyj) {
            System.out.println("Nie udało się wczytać danych. " + wyj.getMessage());
        }
    }
    
    public static void main(String[] args) throws BrakPliku, FileNotFoundException {
        Program p= new Program();
        String separator = "[\\s.,:;!?'\"„”()—\\-»«…*/]+";

        System.out.println("\n**** Rozróżniane wielkie i małe litery\n");
        p.test(new Indekser(), new Filtr_txt(separator));

        System.out.println("\n**** Wszystkie litery traktowane jako małe\n");
        p.test(new Indekser(), new FiltrLiterki_txt(separator));
    }
}