import java.util.Scanner;

/**
 * Esercizio esercitazione riferimenti
 */
public class Es1 {
    public static void main(String[] args) {
        Integer m = 12; // Dichiarazione della variabile
        Integer p = m;  // Assegnazione del riferimento

        System.out.println("m vale: " + m);
        System.out.println("L'indirizzo di m è: " + System.identityHashCode(m) + "\n");

        System.out.println("*p referenzia il valore: " + p);
        System.out.println("Il contenuto di p è: " + System.identityHashCode(p));
        System.out.println("Si osservi che il contenuto di p è l'indirizzo di m");
        System.out.println("L'indirizzo di p è: " + System.identityHashCode(p) + "\n");
    }
}
