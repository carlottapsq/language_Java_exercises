import java.util.Scanner;

/**
 * Popolare un array di interi di dimensione 4, stamparne a video il contenuto.
 */
public class Es1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 4;
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Inserisci un numero:");
            a[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Il numero in posizione " + i + " è: " + a[i]);
        }

        scanner.close();
    }
}

