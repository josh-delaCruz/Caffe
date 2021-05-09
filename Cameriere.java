
import java.util.Random;


public class Cameriere{
    protected static int nOrdinazioni = 0;
    
    protected static int Ordinazione(){
        int n = 0;
        n = new Random().nextInt(4);
        return n;
    }
    
    public String guadagnoCaffe(){
        String s = "";
        
        s += "Il bar ha guadagnato: " + nOrdinazioni + "€";
        
        return s;
    }
}
