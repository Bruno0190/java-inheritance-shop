import java.util.Random;

public class Smartphone extends Prodotto {

    public String imei;
    public float memoria;
    
    public Smartphone(String nome, String marca, float prezzo, float iva, String imei, float memoria){
        super(nome, marca, prezzo, iva);

        Random randomico = new Random();
        StringBuilder sigla = new StringBuilder(15);

        for (int i = 0; i < 15; i++) {
            int cifra = randomico.nextInt(10);
            sigla.append(cifra);
        }

        this.imei = sigla.toString();
        this.memoria = memoria;
 
    }

    public void memoria(){
        System.out.println("Il prodotto "+nome+ " - Codice IMEI: "+imei+" vanta una memoria "+memoria);
    }
    //aggiungere commenti

}
