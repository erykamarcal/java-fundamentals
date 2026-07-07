package javastudies.fundamentals.arrays;

import java.util.Scanner;

public class AbaixoDaMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        double soma = 0;
        double[] vetor = new double[n];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = scanner.nextDouble();
            soma += vetor[i];
        }
        double media = soma / vetor.length;
        System.out.println(media);

        for (double numero : vetor) {
            if (numero < media) {
                System.out.println(numero);
            }

        }


        scanner.close();
    }
}
