package javastudies.arrays;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        long [] fibonacci = new long[61];
        fibonacci[0] = 0;
        fibonacci[1] = 1;


        for (int i = 2; i < fibonacci.length; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        for (int i = 0; i < n; i++) {
         int posicao = scanner.nextInt();
            System.out.println("Fib(" + posicao + ") = " + fibonacci[posicao]);
        }
        scanner.close();
    }
}
