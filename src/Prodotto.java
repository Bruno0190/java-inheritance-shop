import java.util.Random;

public class Prodotto {

    public int codice;
    public String nome;
    public String marca;
    public float prezzo;
    public float iva;

    public Prodotto(String nome, String marca, float prezzo, float iva){
        Random rnd = new Random();
        this.codice = rnd.nextInt(999999);
        this.nome = nome;
        this.marca = marca;
        this.prezzo = prezzo;
        this.iva = iva;   
    }

    public String prezzoBase() {
        return "Il prezzo base è "+prezzo+" euro";
    }

    public String prezzoIvato() {
        return "Il prezzo ivato è "+(prezzo + (prezzo*iva/100))+" euro";
    }

    public String nomeEcodiceEmarca(){
        return "Prodotto: "+codice+" - "+nome+" marca: "+marca;
    }

//aggiungere commenti
public String getNome(){
    return nome;
}

public String getMarca(){
    return marca;
}
}
