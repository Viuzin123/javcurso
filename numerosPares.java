package JAVA.Vetores;

import java.util.Scanner;

public class numerosPares {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Informe a quantidade de numeros a serem escritos: ");
        int n = scan.nextInt();

        int[] N = new int[n];

        //Colocar e guardar os números
        for (int i = 0; i < n; i++) {
            System.out.print("Número: ");
            N[i] = scan.nextInt();
        }

        System.out.print("Números pares: ");

        //Sequência e condição para quantidade de números pares
        int numeroPar = 0;
        for (int i = 0; i < n; i++) {
            if (N[i] % 2 == 0) {
                numeroPar++;
                System.out.print(N[i]);
            }
        }

        //Imprimir resultado na tela
        System.out.println("Quantidade de números pares: "+numeroPar);

    }
}
