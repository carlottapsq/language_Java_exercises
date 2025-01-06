import java.util.Scanner;

public class Esercizio13 {
    public static void main(String[] args) {
        int n, prec1, prec2;
        Scanner sc = new Scanner(System.in);
        System.out.print("quanti numeri vuoi inseirire?");
        n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("inserisci i numeri");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < n / 2; i++) {
            prec1 = array[i];
            prec2 = array[n - i - 1];
            array[i] = prec2;
            array[n - i - 1] = prec1;
        }
        System.out.println("\nArray dopo il riordinamento");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

