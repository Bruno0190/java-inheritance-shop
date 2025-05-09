import java.util.Random;

public class Televisori extends Prodotto {

    public int dimensioni;
    public String smart;
    int[] numeri = {32, 40, 43, 50, 55, 65, 75};
    boolean[] booleani = {true, false};

    public Televisori(String nome, String marca, float prezzo, float iva, int dimensioni, boolean smart){
        super(nome, marca, prezzo, iva);

        Random randomico = new Random();

        this.dimensioni = numeri[randomico.nextInt(7)];
        boolean optional = booleani[randomico.nextInt(2)];
        if (optional == true) {
            this.smart = "smart";
        } else {
            this.smart = "no smart";
        }
        
    }

    public void tv() {
        System.out.println("Congratulazioni il vostro televisore "+nome+" - "+marca+" è di dimensioni "+dimensioni+". Optional: "+smart);
    }
}//aggiungere commenti
