package sonda;


public class CzujnikSejsmiczny extends Czujnik {

//Dziedziczenie atrybutu po klasie Czujnik
    public CzujnikSejsmiczny(String nazwa){
        super(nazwa);
       
}
   
    public String getNazwa(){
        return(nazwa);
    }
    
    //nadpisanie metody czytaj, z uwzględnionym BłędemOdczytu
    @Override
    public String czytaj(int wartosc) throws BłądOdczytu{
    String wiadomosc="";
    try{
        if(wartosc>=0){
        wiadomosc=Integer.toString(wartosc);
        //System.out.println(nazwa+ " : " +wartosc);
    }
    else{
            throw new BłądOdczytu("B_odcz");
            }}
    catch(BłądOdczytu b){
        //System.out.println(nazwa+ " : " +b.getMessage());
        wiadomosc=b.getMessage();
    }
    return(wiadomosc);
    }

    }