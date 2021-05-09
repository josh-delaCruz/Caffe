
public class Cliente extends Thread {
    
    public String nome;
    public int tmp = 0;
    
    
    //costruttore
    public Cliente(String nome) {
        this.nome = nome;
    }
    
    
    
    @Override
    public void run() {
        try {
            System.out.println(nome + " Attende di poter ordinare");
            Caffe.ordinazione.acquire();
            
            System.out.println(nome + " ordina");
            tmp = Cameriere.Ordinazione() +1;
            Cameriere.nOrdinazioni += tmp;
            System.out.println("n ordinazioni: " + tmp);
            Caffe.ordinazione.release();
            
            
        } catch (Exception e) {}
    }
    
    
}
