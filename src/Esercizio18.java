//Scrivere una funzione C++ che restituisca la differenza tra il valore massimo
//e il valore minimo di un vettore di n elementi. Scrivere un programma C++ che
//calcoli e visualizzi il risultato dopo aver richiesto all'utente l'inserimento degli elementi.


import java.util.Scanner;

public class Esercizio18 {
    public static void main(String[] args) {
        int n, min, max;
        Scanner sc = new Scanner(System.in);

        System.out.print("Quanti numeri vuoi inserire? ");
        n = sc.nextInt();

        int[] array = new int[n];
        System.out.println("Inserisci i numeri:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }



        max = array[0];
        min = array[0];


        for (int i = 0; i < n; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }


        System.out.println("\nArray totale:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println("\nMassimo: " + max + "; Minimo: " + min);
    }
}
