    package javastudies.arrays;

    import java.util.Scanner;

    public class SomaVetores {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int n = scanner.nextInt();
            int [] vetorA = new int[n];
            int [] vetorB = new int[n];
            int [] vetorC = new int[n];


            for (int i = 0; i < vetorA.length; i++) {
                vetorA[i] = scanner.nextInt();
            }
            for (int i = 0; i < vetorB.length; i++) {
                vetorB[i] = scanner.nextInt();
            }

            for (int i = 0; i < vetorC.length; i++) {
                vetorC[i] = vetorA[i] + vetorB[i];
            }
            for (int numero : vetorC) {
                System.out.print(numero + " ");

            }


            scanner.close();
        }
    }
