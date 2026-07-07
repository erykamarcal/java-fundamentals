package javastudies.fundamentals.matrices;

import java.util.Scanner;

public class NumerosNegativos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int linhas = scanner.nextInt();
        int colunas = scanner.nextInt();

        int[][] matriz = new int[linhas][colunas];


        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j]= scanner.nextInt();
            }
        }
        System.out.println("VALORES NEGATIVOS:");

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (matriz[i][j] < 0){
                    System.out.println(matriz[i][j]);
                }
            }
        }
        scanner.close();
    }
}
