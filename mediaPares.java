package JAVA.Vetores;

import java.util.Scanner;

public class mediaPares {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Quantos números vai ler na tela: ");
        int n = scan.nextInt();

        int[] N = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Escreva um número: ");
            N[i] = scan.nextInt();
        }

        int soma = 0;
        int numerosPares = 0;
        double media;

        for (int i = 0; i < n; i++) {
            if (N[i] % 2 == 0) {
                soma += N[i];
                numerosPares++;
            }
        }

        if (numerosPares == 0) {
            System.out.println("Nenhum número par.");
        } else {
          media = soma / numerosPares;
            System.out.println(media);
        }

    }
}

