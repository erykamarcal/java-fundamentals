package javastudies.metodos;

import java.util.Scanner;

public class MaiorElementoMatriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[][] matriz = new int[n][n];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        int maior = maiorElemento(matriz);

        mostrarMaiorElemento(maior);

        scanner.close();
    }

    public static int maiorElemento(int[][] matriz) {
        int maior = matriz[0][0];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
            }
        }
        return maior;
    }

    public static void mostrarMaiorElemento (int maiorValor){
        System.out.println("Maior elemento da matriz: " + maiorValor);
    }
}
