import java.util.Scanner;

/**
 * Progettare un algoritmo che effettui la lettura da tastiera di una serie di coppie di valori numerici.
 * L’algoritmo deve calcolare e stampare il rapporto tra il valore minore e quello maggiore dei due.
 * Il programma termina quando uno dei due valori o entrambi sono uguali a zero.
 */

public class Es1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;
        double rapporto;

        do {
            System.out.println("Inserisci a:");
            a = scanner.nextInt();
            System.out.println("Inserisci b:");
            b = scanner.nextInt();

            if (a != 0 && b != 0) {
                if (a > b) {
                    rapporto = (double) b / a;
                } else {
                    rapporto = (double) a / b;
                }
                System.out.printf("\nIl risultato è: %f\n\n", rapporto);
            }
        } while (a != 0 && b != 0);

        scanner.close();
    }
}
