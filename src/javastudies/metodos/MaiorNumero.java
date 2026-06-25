package javastudies.metodos;

import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int valorA = scanner.nextInt();
        int valorB = scanner.nextInt();

        int maior = maiorValor(valorA,valorB);
        mostrarValor(maior);

        scanner.close();
    }

    public static int maiorValor(int a, int b) {
        if (a > b) {
           return  a;
        } else {
            return b;
        }
    }

    public static void mostrarValor(int value){
        System.out.println("Maior = " + value);
    }
}

