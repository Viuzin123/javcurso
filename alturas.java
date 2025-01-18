package JAVA.Vetores;

import java.util.Scanner;

public class alturas {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Quantas pessoas serão digitadas: ");
        int n = scan.nextInt();

        String[] nome = new String[n];
        int[] idade = new int[n];
        double[] altura = new double[n];


        for (int i = 0; i < n; i++) {

            System.out.println("dados da " + (i + 1) + "° pessoa");

            System.out.print("Nome:");
            nome[i] = scan.next();

            System.out.println("Idade: ");
            idade[i] = scan.nextInt();

            System.out.println("Altura: ");
            altura[i] = scan.nextDouble();

        }

        int menores = 0;
        double alturaTotal = 0;

        for (int i = 0; i < n; i++) {
            if (idade[i] < 16) {
                menores++;
            }
            alturaTotal = alturaTotal + altura[i];
        }

        double alturaMedia = alturaTotal / n;

        double percentualMenor = (menores / n) * 100;

        System.out.println("Altura média: " + alturaMedia);

        for (int i = 0; i < n; i++) {
            if (idade[i] < 16) {
                System.out.println("Menores: " + menores);
                System.out.println("Porcentagem de menores de idade: "+percentualMenor);

            }
        }
    }
}
