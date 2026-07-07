package javastudies.fundamentals.matrices;

import java.util.Scanner;

public class SomaMatrizes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int linhas = scanner.nextInt();
        int colunas = scanner.nextInt();

        int[][] matrizA = new int[linhas][colunas];
        int[][] matrizB = new int[linhas][colunas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matrizA[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matrizB[i][j] = scanner.nextInt();
            }
        }

        int[][] matrizC = new int[linhas][colunas];
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(matrizC[i][j] + " ");
            }
            System.out.println();
        }


        scanner.close();
    }
}
