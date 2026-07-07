package javastudies.fundamentals.arrays;

import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] vetorDeNumeros = new int[n];

        int qtdPares = 0;

        for (int i = 0; i < vetorDeNumeros.length; i++) {
            vetorDeNumeros[i] = scanner.nextInt();
            if (vetorDeNumeros[i] % 2 == 0) {
                qtdPares++;
            }
        }
        for (int numero : vetorDeNumeros) {
            if (numero % 2 == 0) {
                System.out.print(numero + " ");
            }
        }

        System.out.println("\nQuantidade de Pares: " + qtdPares);

        scanner.close();
    }
}

