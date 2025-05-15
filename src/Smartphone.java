import java.util.Random;

public class Smartphone extends Prodotto {

    public String imei;
    public float memoria;
    
    public Smartphone(String nome, String marca, float prezzo, float iva, String imei, float memoria){
        super(nome, marca, prezzo, iva);

        Random randomico = new Random();
        StringBuilder siglaImei = new StringBuilder(15);

        for (int i = 0; i < 15; i++) {
            int cifra = randomico.nextInt(10);
            siglaImei.append(cifra);
        }

        this.imei = siglaImei.toString();
        this.memoria = memoria;
 
    }

    public String memoria(){
        return "Il prodotto "+nome+ " - Codice IMEI: "+imei+" vanta una memoria "+memoria;
    }
    //aggiungere commenti

}
