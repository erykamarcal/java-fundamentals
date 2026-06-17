package javastudies.arrays;

import java.util.Scanner;

public class MediaPares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] vetor = new int[n];
        int somaPares = 0;
        int qtdPares = 0;

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = scanner.nextInt();
            if (vetor[i] % 2 == 0) {
                somaPares += vetor[i];
                qtdPares++;
            }
        }
        if (qtdPares > 0) {
            double media = (double) somaPares / qtdPares;
            System.out.println(media);
        } else {
            System.out.println("Nao ha numeros pares");
        }

        scanner.close();
    }
}
