package javastudies.metodos;

import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double nota1 = scanner.nextDouble();
        double nota2 = scanner.nextDouble();
        double nota3 = scanner.nextDouble();

        double mediaFinal = calcularMedia(nota1, nota2, nota3);

        mostrarResultado(mediaFinal);

        scanner.close();
    }

    public static double calcularMedia(double nota1, double nota2,double nota3){
        return (nota1 + nota2 + nota3)/3;
    }

    public static void mostrarResultado(double resultado){
        System.out.printf("Media final: %.2f%n", resultado);
    }
}
