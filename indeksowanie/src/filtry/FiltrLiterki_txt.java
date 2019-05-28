/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filtry;

import java.util.Locale;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class FiltrLiterki_txt extends Filtr {

    public FiltrLiterki_txt(String separator) {
        super(separator);
    }
    
    @Override
    public String dajSłowo(){
        String slowo;
        slowo=skaner.next().toLowerCase(Locale.forLanguageTag("PL"));
        return(slowo);
    }
}
