package JAVA.Vetores;

import java.util.Scanner;

public class maiorPosicao {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o a quantidade de números a digitar: ");
        int n = scan.nextInt();

        int[] N = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Número: " + i);
            N[i] = scan.nextInt();
        }

        double maior = 0;
        int posmaior = 0;

        for (int i=1; i<n; i++) {
            if (N[i] > maior) {
                maior = N[i];
                posmaior = i;
            }
        }

        System.out.printf("MAIOR VALOR = %.1f\n", maior);
        System.out.printf("POSICAO DO MAIOR VALOR = %d\n", posmaior);
    }
}
