package javastudies.metodos;

import java.util.Scanner;

public class SomaVetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] vetor = new int[n];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = scanner.nextInt();
        }


        int soma = somarVetor(vetor);
        mostrarResultado(soma);


        scanner.close();
    }

    public static int somarVetor (int[] vetor) {
        int soma = 0;
        for (int numero : vetor) {
            soma += numero;
        }
        return soma;
    }

    public static void mostrarResultado (int soma){
        System.out.println("Resultado: " + soma);
    }
}
