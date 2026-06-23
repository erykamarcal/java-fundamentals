package javastudies.matrizes;

import java.util.Scanner;

public class ValoresMatrizes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        double[][] matriz = new double[n][n];
        double somaPositivos = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = scanner.nextDouble();
                if (matriz[i][j] > 0) {
                    somaPositivos += matriz[i][j];
                }
            }
        }
        System.out.println("SOMA POSITIVOS: " + somaPositivos);

        int linhaEscolhida = scanner.nextInt();

        System.out.print("LINHA ESCOLHIDA: ");

        for (int j = 0; j < n; j++) {
            System.out.print(matriz[linhaEscolhida][j] + " ");
        }
        System.out.println();

        int colunaEscolhida = scanner.nextInt();

        System.out.print("COLUNA ESCOLHIDA: ");

        for (int i = 0; i < n; i++) {
            System.out.print(matriz[i][colunaEscolhida] + " ");
        }

        System.out.println();
        System.out.print("DIAGONAL PRINCIPAL: ");
        for (int i = 0; i < n; i++) {
            System.out.print(matriz[i][i] + " ");
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] < 0) {
                    matriz[i][j] = matriz[i][j] * matriz[i][j];
                }
            }
        }
        System.out.println();
        System.out.println("MATRIZ ALTERADA: ");


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
