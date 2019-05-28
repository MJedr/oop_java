package filtry;
import java.io.File;
import java.io.FileNotFoundException;   
import java.util.Scanner;


public abstract class Filtr {
    protected Scanner skaner;
    protected String separator;
    public Filtr(String separator){
        this.separator = separator;
    }

    public void otwórz_plik(String nazwa) throws BrakPliku{
        File plik = new File(nazwa);
        try {
            skaner = new Scanner(plik).useDelimiter(separator);
        } catch (FileNotFoundException ex) {
            if (!plik.exists()) {
                throw new BrakPliku("Brak pliku : " + nazwa );
            }
        }
    } 
    
    
    public boolean czyJestNastępny(){
    return(skaner.hasNext());
    }

    
    public String dajSłowo(){
        String slowo = skaner.next();
        return(slowo);
    }
    
    
    public void zamknij_plik(){
        skaner.close();
    }
}
