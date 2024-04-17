package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Product[] vet = new Product[n];

        for (int i = 0; i < vet.length; i++) {
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vet[i] = new Product(name, price);
        }

        double soma = 0.0;
        for (int i = 0; i < vet.length; i++) {
            soma += vet[i].getPrice();
        }

        double media = soma / vet.length;

        System.out.printf("Media dos preços: %.2f", media);

        sc.close();
    }
}
