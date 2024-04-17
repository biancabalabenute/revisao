package application;

import entities.Rent;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rent[] vet = new Rent[10];

        System.out.print("Quantos quartos deseja reservar? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("\nQuarto " + i + ": ");
            System.out.print("\nNome: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.next();
            System.out.print("Quarto: ");
            int numQuarto = sc.nextInt();

            vet[numQuarto] = new Rent(name, email);
        }

        System.out.println("\nQuartos ocupados: ");
        for (int i = 0; i < 10; i++) {
            if (vet[i] != null)
                System.out.println(i + ": " + vet[i]);
        }

        sc.close();
    }
}
