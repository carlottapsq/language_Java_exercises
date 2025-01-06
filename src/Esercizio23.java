{

public static boolean eSimmetrica(int[][] matrice) {
    int n = matrice.length;

    // (matrice[i][j] == matrice[j][i])
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if (matrice[i][j] != matrice[j][i]) {
                return false; // La matrice non è simmetrica
            }
        }
    }
    return true;
}

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


            System.out.print("Inserisci la dimensione della matrice quadrata (n): ");
            int n = scanner.nextInt();


            int[][] matrice = new int[n][n];

            // elementi
            System.out.println("Inserisci gli elementi della matrice:");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print("Elemento [" + i + "][" + j + "]: ");
                    matrice[i][j] = scanner.nextInt();
                }
            }

            // Verifica in output
            if (eSimmetrica(matrice)) {
                System.out.println("La matrice è simmetrica.");
            } else {
                System.out.println("La matrice non è simmetrica.");
            }

            scanner.close();
        }
}
