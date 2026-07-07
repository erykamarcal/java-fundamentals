package javastudies.fundamentals.matrices;

import java.util.Scanner;

public class MaiorElementoLinha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[][] matriz = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            int maiorDaLinha = matriz[i][0];

            for (int j = 1; j < n; j++) {
                if (matriz[i][j] > maiorDaLinha){
                    maiorDaLinha = matriz [i][j];
                }
            }
            System.out.println("Maior da linha: " + maiorDaLinha);
        }


        scanner.close();
    }
}
