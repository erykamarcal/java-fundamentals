package javastudies.fundamentals.arrays;

import java.util.Scanner;

public class LucroMercadorias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        String[] nomes = new String[n];
        double[] precosCompra = new double[n];
        double[] precosVenda = new double[n];

        int lucroAbaixo10 = 0;
        int lucroEntre10e20 = 0;
        int lucroAcima20 = 0;
        double totalCompra = 0;
        double totalVenda  = 0;

        for (int i = 0; i < n; i++) {
            nomes[i] = scanner.next();
            precosCompra[i] = scanner.nextDouble();
            precosVenda[i] = scanner.nextDouble();
            totalCompra += precosCompra[i];
            totalVenda += precosVenda[i];
        }

        for (int i = 0; i < n; i++) {
            double lucroPercentual = (precosVenda[i] - precosCompra[i]) / precosCompra[i] * 100.0;
            if (lucroPercentual < 10.0) {
                lucroAbaixo10++;
            } else if (lucroPercentual <= 20.0) {
                lucroEntre10e20++;
            } else {
                lucroAcima20++;
            }
        }

        double lucroTotal = totalVenda - totalCompra;

        System.out.println("Lucro abaixo de 10%: " + lucroAbaixo10);
        System.out.println("Lucro entre 10% e 20%: " + lucroEntre10e20);
        System.out.println("Lucro acima de 20%: " + lucroAcima20);
        System.out.printf("Valor total de compra: %.2f%n", totalCompra);
        System.out.printf("Valor total de venda: %.2f%n", totalVenda);
        System.out.printf("Lucro total: %.2f%n", lucroTotal);

        scanner.close();
    }
}
