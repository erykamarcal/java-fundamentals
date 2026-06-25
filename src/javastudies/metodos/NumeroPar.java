package javastudies.metodos;

import java.util.Scanner;

public class NumeroPar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = scanner.nextInt();

        boolean par = ehPar(numero);
        mostrarResultado(par);

        scanner.close();
    }

    public static boolean ehPar(int numero){
        return numero % 2 == 0;
    }

    public static void mostrarResultado(boolean valor){
        if (valor) {
            System.out.println("O número é par");
        } else {
            System.out.println("O número é ímpar");
        }
    }
}

