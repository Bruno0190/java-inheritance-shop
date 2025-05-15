import java.util.Random;

public class Televisori extends Prodotto {

    public int dimensioni;
    public String smart;

    // Array con possibili dimensioni dello schermo
    int[] numeri = {32, 40, 43, 50, 55, 65, 75};

    // Costruttore
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

    // Metodo che descrive il televisore
    public String tv() {
        return "Congratulazioni, il vostro televisore " + nome + " - " + marca +
               " è di dimensioni " + dimensioni + ". Optional: " + smart;
    }
}

