package javastudies.arrays;

import java.util.Scanner;

public class AlunosAprovados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        String [] nomesAlunos = new String[n];
        double [] notasPrimeiroSemestre = new double[n];
        double [] notasSegundoSemestre = new double[n];

        for (int i = 0; i < nomesAlunos.length; i++) {
            nomesAlunos[i] = scanner.next();
            notasPrimeiroSemestre [i] = scanner.nextDouble();
            notasSegundoSemestre [i] = scanner.nextDouble();
        }
        System.out.println("Alunos Aprovados:");
        for (int i = 0; i < nomesAlunos.length; i++) {
            double mediaNotas = (notasPrimeiroSemestre[i] + notasSegundoSemestre[i]) / 2.0;
            if (mediaNotas >= 6.0){
                System.out.println(nomesAlunos[i]);
            }
        }

        scanner.close();
    }
}
