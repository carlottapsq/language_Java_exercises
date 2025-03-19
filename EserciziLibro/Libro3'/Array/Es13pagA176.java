//Scrivere un programma in Java che richieda all'utente di inserire un certo numero di interi, memorizzarli
// in un array e poi invertire l'ordine degli elementi dell'array. Infine, il programma deve stampare l'array invertito.

import java.util.Scanner;

public class Es13pagA176 {
    public static void main(String[] args) {
        int n, prec1, prec2;
        Scanner sc = new Scanner(System.in);
        System.out.print("quanti numeri vuoi inserire?");
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

