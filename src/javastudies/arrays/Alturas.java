package javastudies.arrays;

import java.util.Scanner;

public class Alturas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        double[] alturas = new double[n];
        char[] sexos = new char[n];

        double somaAlturaMulheres = 0;
        int qtdMulheres = 0;
        int qtdHomens = 0;

        for (int i = 0; i < n; i++) {
            alturas[i] = scanner.nextDouble();
            sexos[i] = scanner.next().charAt(0);
            if (sexos[i] == 'F'){
            somaAlturaMulheres += alturas[i];
            qtdMulheres++;
            } else if (sexos[i] == 'M'){
                qtdHomens++;
            }
        }
        double mediaAlturaMulheres = somaAlturaMulheres/qtdMulheres;
        double maiorAltura = alturas[0];
        double menorAltura = alturas[0];

        for (int i = 1; i < n; i++) {
            if (alturas[i] > maiorAltura){
            maiorAltura = alturas[i];
            }
            if (alturas[i] < menorAltura){
                menorAltura = alturas[i];
            }
        }
        System.out.println("Menor altura = " + menorAltura);
        System.out.println("Maior altura = " + maiorAltura);
        System.out.printf("Media das alturas das mulheres = %.2f%n", mediaAlturaMulheres);
        System.out.println("Numero de homens: " + qtdHomens);

        scanner.close();
    }
}
