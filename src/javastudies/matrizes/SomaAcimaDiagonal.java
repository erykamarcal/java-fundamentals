package javastudies.matrizes;

import java.util.Scanner;

public class SomaAcimaDiagonal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[][] matriz = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        int soma = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (j > i) {
                    soma += matriz[i][j];
                }

            }
        }

        System.out.println(soma);

        scanner.close();
    }
}
