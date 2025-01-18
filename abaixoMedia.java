package JAVA.Vetores;

import java.util.Scanner;

public class abaixoMedia {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int n = scan.nextInt();

        double[] N = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite um número: ");
            N[i] = scan.nextDouble();
        }
        double soma = 0;
        double media = 0;
        double abaixoMedia = 0;

        //Soma dos vetores
        for (int i = 0; i < n; i++) {
            soma += N[i];
        }
        for (int i = 0; i < n; i++) {
            media = soma / n;
            if(N[i] < media) {
                abaixoMedia++;
            }
        }

        System.out.println("Valor médio do vetor: "+media);
        System.out.println("Valores abaixo da média: "+abaixoMedia);
    }
}
