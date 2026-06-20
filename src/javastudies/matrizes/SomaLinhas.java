package javastudies.matrizes;

import java.util.Scanner;

public class SomaLinhas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[][] matriz = new int[n][n];


        for (int i = 0; i < n; i++) {
            int somaLinhas = 0;

            for (int j = 0; j < n; j++) {
                matriz[i][j] = scanner.nextInt();
                somaLinhas += matriz[i][j];
            }
            System.out.println(somaLinhas);
        }
        scanner.close();
    }
}
