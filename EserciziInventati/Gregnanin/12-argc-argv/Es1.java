import java.util.Scanner;

/**
 * Scrivi un programma che legge da input un numero intero positivo (N) e poi
 * disegna a terminale un quadrato vuoto composto di asterischi ('*')
 * con il lato lungo N:
 *
 * Per N pari a 3 il programma stampa:
 *
 * ***
 * * *
 * ***
 *
 * Per N pari a 5 il programma stampa:
 *
 * *****
 * *   *
 * *   *
 * *   *
 * *****
 */

public class Es1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci un numero intero positivo: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Il numero deve essere maggiore di 0");
            return;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}

