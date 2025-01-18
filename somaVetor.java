package JAVA.Vetores;

import java.util.Scanner;

public class somaVetor {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double media, soma = 0;

        System.out.print("Escreva um número: ");
        int n = scan.nextInt();

        int[] N = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite um número: ");
            N[i] = scan.nextInt();
        }

        for (int i = 0; i < n; i++) {
            soma = soma + N[i];
        }

        media = soma/n;

        System.out.println("VALORES:");
        for (int i = 0; i < n; i++) {
            System.out.println(N[i]);
        }

        System.out.println("SOMA: "+soma);
        System.out.println("MÉDIA: "+media);
    }
}
