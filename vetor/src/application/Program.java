package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] vet = new double[n];

        for (int i = 0; i < n; i++) {
            vet[i] = sc.nextDouble();
        }

        double soma = 0.0;
        for (int i = 0; i < n; i++) {
            soma += vet[i];
        }

        double media = soma / n;
        System.out.printf("Altura media: %.2f", media);

        sc.close();
    }
}
