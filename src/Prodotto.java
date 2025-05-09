import java.util.Random;

public class Prodotto {

    public int codice;
    public String nome;
    public String marca;
    public float prezzo;
    public float iva;

    public Prodotto(String nome, String marca, float prezzo, float iva){
        Random codice = new Random();
        this.codice = codice.nextInt(999999);
        this.nome = nome;
        this.marca = marca;
        this.prezzo = prezzo;
        this.iva = iva;   
    }

    public void prezzoBase() {
        System.out.println("Il prezzo base è "+prezzo+" euro");
    }

    public void prezzoIvato() {
        System.out.println("Il prezzo ivato è "+(prezzo + (prezzo*iva/100))+" euro");
    }

    public void nomeEcodiceEmarca(){
        System.out.println("Prodotto: "+codice+" - "+nome+" marca: "+marca);
    }

//aggiungere commenti
}
