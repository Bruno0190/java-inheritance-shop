import java.util.ArrayList;
import java.util.Scanner;

public class Carrello {

    public static void main(String[] args) {

        boolean continua = true;

        ArrayList<Prodotto> carrello = new ArrayList<>();
        
        Scanner input = new Scanner(System.in);



        while (continua) {

            System.out.println("Desidera acquistare uno Smartphone, un Televisore o delle Cuffie ?");
            String elemento = input.nextLine().toLowerCase();

            System.out.println("nome prodotto prego");
            String nome = input.nextLine();
            System.out.println("quale marca?");
            String marca = input.nextLine();
            

            switch (elemento) {
                case "smartphone" : 
                    System.out.println("Che memoria?");
                    float memoria = input.nextFloat(); 
                    input.nextLine(); //sennò sembra che il nextLine non scatti correttamente alla risposta successiva perchè rimane una linea dopo nextFloat
                    
                    float prezzoSmartphone = 800.0f;
                    float ivaSmartphone = 10.0f;

                    Smartphone smartphone = new Smartphone(nome, marca, prezzoSmartphone, ivaSmartphone, marca, memoria);

                    carrello.add(smartphone);


                    
                    break;

                case "televisore" :
                    String[] sceltaSmart = {"smart", "no smart"};

                    System.out.println("Che dimensioni");
                    int dimensioni = input.nextInt();
                    input.nextLine(); //sennò sembra che il nextLine non scatti correttamente alla risposta successiva perchè rimane una linea dopo nextInt
                    System.out.println("Digiti 0 per versione smart oppure 1 per versione no smart");
                    int sceltaUtente = input.nextInt();
                    input.nextLine(); //sennò sembra che il nextLine non scatti correttamente alla risposta successiva perchè rimane una linea dopo nextInt
                    String opzione = sceltaSmart[sceltaUtente];

                    float prezzoTv = 500.0f;
                    float ivaTv = 22.0f;

                    Televisori tv = new Televisori(nome, marca, prezzoTv, ivaTv, dimensioni, opzione);

                    carrello.add(tv);

                    break;

                case "cuffie" :
                    String[] sceltaAttacco = {"wireless", "cablate"};

                    System.out.println("Che colore preferisce?");
                    String colore = input.nextLine();
                    System.out.println("Digiti 0 attacco wireless o 1 cablate");
                    int sceltaUtente2 = input.nextInt();
                    input.nextLine(); //sennò sembra che il nextLine non scatti correttamente alla risposta successiva perchè rimane una linea dopo nextInt
                    String attacco = sceltaAttacco[sceltaUtente2];

                    float prezzoCuffie = 70.0f;
                    float ivaCuffie = 5.0f;

                    Cuffie cuffie = new Cuffie(nome, marca, prezzoCuffie, ivaCuffie, colore, attacco);

                    carrello.add(cuffie);

                    break;

            
                default:
                    break;
            }
    
            System.out.println("Digiti \"s\" per acquistare altri prodotti o \"n\" se ha concluso");

            String risposta = input.nextLine().toLowerCase();

            if (risposta.equals("n")) {

                continua = false;



            }

        }     


        System.out.println("Prodotti inseriti: ");

        for (Prodotto p : carrello) {
            System.out.println(p);
        };



        input.close();
    }

}
