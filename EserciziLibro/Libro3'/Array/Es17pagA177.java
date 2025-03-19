//Scrivere una funzione C++ che, a partire da due vettori numerici ordinati forniti
//come argomenti, ne costruisca un terzo avente dimensione pari alla somma delle
//due dimensioni e contenente tutti gli elementi dei due vettori in una sequenza ordinata
// (per esempio, da {1, 2, 4} e {1, 3, 9} si deve ottenere {1, 1, 2, 3, 4, 9}).
// Scrivere un programma C++ che, utilizzando la funzione precedente e costruendo
// i vettori iniziali a partire da valori acquisiti da tastiera, visualizzi il vettore risultato.


import java.util.ArrayList;
import java.util.Scanner;

public class Es17pagA177 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> resultArray = new ArrayList<>();

        // Input del primo array
        System.out.print("Inserisci la dimensione del primo array: ");
        int n1 = scanner.nextInt();
        System.out.println("Inserisci gli elementi del primo array:");
        for (int i = 0; i < n1; i++) {
            resultArray.add(scanner.nextInt());
        }

        // Input del secondo array
        System.out.print("Inserisci la dimensione del secondo array: ");
        int n2 = scanner.nextInt();
        System.out.println("Inserisci gli elementi del secondo array:");
        for (int i = 0; i < n2; i++) {
            resultArray.add(scanner.nextInt());
        }

        // Ordinamento con Selection Sort
        for (int i = 0; i < resultArray.size() - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < resultArray.size(); j++) {
                if (resultArray.get(j) < resultArray.get(minIndex)) {
                    minIndex = j;
                }
            }
            int temp = resultArray.get(i);
            resultArray.set(i, resultArray.get(minIndex));
            resultArray.set(minIndex, temp);
        }

        // Output
        System.out.println("Array concatenato e ordinato:");
        for (int num : resultArray) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
