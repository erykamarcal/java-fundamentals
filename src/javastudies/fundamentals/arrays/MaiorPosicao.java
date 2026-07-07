package javastudies.fundamentals.arrays;

import java.util.Scanner;

public class MaiorPosicao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        double[] vetorDeNumeros = new double[n];

        for (int i = 0; i < vetorDeNumeros.length; i++) {
        vetorDeNumeros[i] = scanner.nextDouble();
        }
        double maiorNumero = vetorDeNumeros[0];
        int posicaoMaiorNumero = 0;

        for (int i = 1; i < vetorDeNumeros.length; i++) {
            if (vetorDeNumeros[i] > maiorNumero){
                maiorNumero = vetorDeNumeros[i];
                posicaoMaiorNumero = i;
            }
        }
            System.out.println(maiorNumero);
            System.out.println(posicaoMaiorNumero);

        scanner.close();
    }
}
