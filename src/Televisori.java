//import java.util.Random;

public class Televisori extends Prodotto {

    public int dimensioni;
    public String opzione;
    String [] scelta = {"smart", "no smart"};

    /*
    int[] numeri = {32, 40, 43, 50, 55, 65, 75};

    public Televisori(String nome, String marca, float prezzo, float iva, boolean optional) {
        super(nome, marca, prezzo, iva);

        Random randomico = new Random();
        this.dimensioni = numeri[randomico.nextInt(numeri.length)];

        if (optional) {
            this.smart = "smart";
        } else {
            this.smart = "no smart";
        }
    }

    public String tv() {
        return "Congratulazioni, il vostro televisore " + nome + " - " + marca +
               " è di dimensioni " + dimensioni + ". Optional: " + smart;
    }
    */


    public Televisori(String nome, String marca, float prezzo, float iva, int dimensioni, String opzione) {
        super(nome, marca, prezzo, iva);
        this.dimensioni = dimensioni;
        this.opzione = opzione;
    }

        //Fare l'Override
    @Override
    public String toString() {
        return "Televisore: " + nome + " - " + marca + ", Dimensioni: " + dimensioni + " pollici, Tipo: " + opzione;
    }



}


