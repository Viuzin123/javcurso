package JAVA.Vetores;
import java.util.Scanner;

public class negativos {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe quantos números: ");
        int n = scan.nextInt();

        int[] N = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("digite um número: ");
            N[i] = scan.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (N[i] < 0) {
                System.out.println("Números negativos: " + N[i]);
            }
        }
    }
}