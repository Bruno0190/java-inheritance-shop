import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Cuffie extends Prodotto {

    public String colore;
    public String attacco;
    
    ArrayList<String> colori = new ArrayList<>(Arrays.asList("giallo", "rosso", "blu", "viola", "verde", "arancio"));

    ArrayList<Boolean> cablaggi = new ArrayList<>(Arrays.asList(true, false));

    public Cuffie(String nome, String marca, float prezzo, float iva){super(nome, marca, prezzo, iva);

        Random randomico = new Random();
        
        this.colore = colori.get(randomico.nextInt(6));

        boolean optional = cablaggi.get(randomico.nextInt(2));

        if (optional == true) {
            this.attacco = "wireless";
        } else {
            this.attacco = "cablate";
        }

    }
   
//aggiungere commenti
}
