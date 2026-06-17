package javastudies.arrays;

import java.util.Scanner;

public class PessoaMaisVelha {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int [] idades = new int[n];
        String [] nomes = new String[n];

        for (int i = 0; i < nomes.length; i++) {
            nomes[i] = scanner.next();
            idades[i] = scanner.nextInt();
        }
        int posicaoMaisVelho = 0;

        for (int i = 1; i < idades.length; i++) {
            if (idades[i] > idades[posicaoMaisVelho]){
                posicaoMaisVelho = i;
            }
        }
        System.out.println("pessoa mais velha: " + nomes[posicaoMaisVelho]);

        scanner.close();
    }
}
