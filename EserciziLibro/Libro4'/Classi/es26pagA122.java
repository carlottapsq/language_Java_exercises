//I prodotti di un supermercato sono identificati da un codice numerico e per ciascuno di essi si hanno le seguenti
// infromazioni: codice identificativo, descrizione sintetica, prezzo unitario, quantità presente in negozio, quantità
// presente in magazzino.

public class es26pagA122 {

       private int codice, quantitaNeg, quantitaMag;
       private double prezzo;
       private String desc;

        public es26pagA122(int codice, int quantitaNeg, int quantitaMag, double prezzo, String desc) {
            this.codice = codice;
            this.quantitaNeg = quantitaNeg;
            this.quantitaMag = quantitaMag;
            this.prezzo = prezzo;
            this.desc = desc;
        }

}
