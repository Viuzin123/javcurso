package JAVA.Vetores;
import java.util.Scanner;

public class maisVelho {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite os números a serem escritos na tela: ");
        int n = scan.nextInt();

        int[] idade = new int[n];
        String[] nome = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Escreva o nome: ");
            nome[i] = scan.next();

            System.out.println("Escreva a idade: ");
            idade[i] = scan.nextInt();
        }
        int maiorIdade;


    }
}
