package Animali;

//Crea un programma in Java che rappresenti una gerarchia di classi per modellare diversi tipi di animali.
//La classe principale deve essere astratta e contenere attributi comuni, mentre le sottoclassi dovranno specializzarsi in base all’alimentazione dell’animale.
//All’interno del metodo main, inizializza un insieme di animali e implementa un meccanismo per contarli in base alla loro dieta,
//individuare quelli con il numero minimo e massimo di zampe e stamparne le informazioni.

public class Main {
    public static void main(String[] args) {
        Animali[] animali = new Animali[13];

        // Esistenti
        animali[0] = new Carnivori(4, "rettili", "grugniti", "Coccodrillo");
        animali[1] = new Carnivori(4, "mammiferi", "squittisce", "Lontra asiatica");
        animali[2] = new Erbivori(4, "mammiferi", "soffia", "Giraffa");
        animali[3] = new Onnivori(4, "mammiferi", "miagola", "Gatto siamese");
        animali[4] = new Onnivori(0, "pesci", "cliccanti", "Pesce palla");
        animali[5] = new Erbivori(4, "mammiferi", "nitrisce", "Zebra");
        animali[6] = new Carnivori(4, "mammiferi", "ruggisce", "Leopardo");
        animali[7] = new Erbivori(4, "mammiferi", "brontola", "Koala");
        animali[8] = new Carnivori(4, "rettili", "sibila", "Cobra");
        animali[9] = new Onnivori(4, "mammiferi", "soffia", "Riccio");
        animali[10] = new Erbivori(4, "mammiferi", "squittisce", "Panda rosso");
        animali[11] = new Erbivori(4, "mammiferi", "muggisce", "Mucca");
        animali[12] = new Carnivori(8, "insetti", "striduli", "Scorpione");

        int countErbivori = 0;
        int countCarnivori = 0;
        int countOnnivori = 0;

        int minZampe = Integer.MAX_VALUE;
        int maxZampe = Integer.MIN_VALUE;
        Animali animaleMinZampe = null;
        Animali animaleMaxZampe = null;

        // Ciclo per contare gli animali e trovare min e max zampe
        for (Animali animale : animali) {
            //INSTANCE OF verifica se un oggetto è un'istanza di una classe specifica o di una delle sue sottoclassi
            if (animale instanceof Erbivori) {
                countErbivori++;
            } else if (animale instanceof Carnivori) {
                countCarnivori++;
            } else if (animale instanceof Onnivori) {
                countOnnivori++;
            }

            int zampe = animale.getZampe();
            if (zampe < minZampe) {
                minZampe = zampe;
                animaleMinZampe = animale;
            }
            if (zampe > maxZampe) {
                maxZampe = zampe;
                animaleMaxZampe = animale;
            }
        }

        // Stampa dei conteggi e degli animali con meno e più zampe
        System.out.println("Numero di erbivori: " + countErbivori);
        System.out.println("Numero di carnivori: " + countCarnivori);
        System.out.println("Numero di onnivori: " + countOnnivori);
        System.out.println("Animale con meno zampe: " + animaleMinZampe);
        System.out.println("Animale con più zampe: " + animaleMaxZampe);

        //Stampa zoo
        System.out.println("Zoo:");
        // Stampa
        for (Animali animale : animali) {
            System.out.println(animale.toString());
        }
    }
}