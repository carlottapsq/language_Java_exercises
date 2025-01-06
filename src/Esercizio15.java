import java.util.ArrayList;
import java.util.Scanner;

public class Esercizio15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il numero di elementi: ");
        int n = scanner.nextInt();

        System.out.print("Inserisci il valore minimo (a): ");
        int a = scanner.nextInt();
        System.out.print("Inserisci il valore massimo (b): ");
        int b = scanner.nextInt();

        ArrayList<Integer> array2 = new ArrayList<>();

        System.out.println("Inserisci gli elementi:");
        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt();
            if (value >= a && value <= b) {
                array2.add(value);
            }
        }

        // Visualizzare gli elementi filtrati
        System.out.println("Elementi nel range [" + a + ", " + b + "]: " + array2);
        System.out.println("Numero di elementi nel range: " + array2.size());

        scanner.close();
    }
}
