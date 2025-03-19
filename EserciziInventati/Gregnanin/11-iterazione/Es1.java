import java.util.Scanner;

/**
 * Dato N un numero intero positivo, generare e visualizzare il numero successivo.
 */
public class Es1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, s; // Dichiarazione variabili di tipo intero

        do {
            System.out.println("Inserisci un numero: "); // Scrivi "inserisci un numero"
            n = scanner.nextInt(); // Leggi n
        } while (n <= 0); // Finché n <= 0

        s = n + 1;
        System.out.println("Il successivo vale: " + s); // Scrivi s

        scanner.close();
    }
}

