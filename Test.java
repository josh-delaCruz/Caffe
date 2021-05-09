
public class Test {

    
    public static void main(String[] args) {
       Cameriere Osvaldo = new Cameriere();
       
       //clienti
       Cliente c1 = new Cliente("Gennaro");
       Cliente c2 = new Cliente("Annamaria");
       Cliente c3 = new Cliente("Ciao");
       
       System.out.println("Bar aperto");
       
       c1.start();
       c2.start();
       c3.start();
       
        try {
           c1.join();
           c2.join();
           c3.join();
        } catch (Exception e) {}
       
        System.out.println("Bar chiuso\n");
        
       System.out.println(Osvaldo.guadagnoCaffe());
    }
}
