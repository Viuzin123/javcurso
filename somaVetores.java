package JAVA.Vetores;

import java.util.Scanner;

public class somaVetores {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("informe os valores de cada vetor: ");
        int n = scan.nextInt();

        int[] A = new int[n];
        int[] B = new int[n];
        int[] C = new int[n];

        System.out.println("valor do vetor A: ");
        for (int i = 0; i < n; i++) {
            A[i] = scan.nextInt();
        }

        System.out.println("valor do vetor B: ");
        for (int i = 0; i < n; i++) {
            B[i] = scan.nextInt();
        }

        for (int i = 0; i < n; i++) {
            C[i] = A[i] + B[i];
        }

        for (int i = 0; i < n; i++) {
            System.out.println("A soma dos vetores -> "+(i+1) + "°: " + C[i]);

        }
    }
}
