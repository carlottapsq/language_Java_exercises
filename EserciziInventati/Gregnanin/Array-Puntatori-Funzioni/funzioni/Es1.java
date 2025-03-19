import java.util.Scanner;

/**
 * Verifica se un valore intero è positivo.
 *
 * Questa funzione controlla se il valore passato come parametro è maggiore di zero.
 * Se il valore è positivo, la funzione restituisce il valore stesso; altrimenti,
 * restituisce -1.
 *
 * valore Il valore intero da verificare.
 * Il valore originale se positivo, oppure -1 se il valore è minore o uguale a zero.
 */
public class Es1 {

    public static int verificaInput(int valore) {
        return (valore > 0) ? valore : -1;
    }

    /**
     * Calcola la somma di due numeri.
     *
     *  n1 primo numero
     *  n2 secondo numero
     *  Restituisce la somma tra n1 e n2
     */
    public static int calcolaSomma(int n1, int n2) {
        return n1 + n2;
    }

    /**
     * Leggere in input da tastiera due numeri maggiori di 0 e farne la somma.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, somma;

        do {
            System.out.print("Inserisci a: ");
            a = scanner.nextInt();
        } while (verificaInput(a) < 0);

        do {
            System.out.print("Inserisci b: ");
            b = scanner.nextInt();
        } while (verificaInput(b) < 0);

        somma = calcolaSomma(a, b);

        System.out.println("La somma è: " + somma);

        scanner.close();
    }
}
