package application;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<TaxPayer> list = new ArrayList<>();

        System.out.print("Insira o numero de contribuintes: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Dados do " + i + " contribuinte");
            System.out.print("Individual ou empresa (i/c)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Rendimento anual: ");
            double income = sc.nextDouble();
            if (ch == 'i') {
                System.out.print("Despesas com saude: ");
                double healthExpenditures = sc.nextDouble();
                list.add(new Individual(name, income, healthExpenditures));
            } else {
                System.out.print("Numero de funcionarios: ");
                int numberOfEmployee = sc.nextInt();
                list.add(new Company(name, income, numberOfEmployee));
            }
        }

        double sum = 0.0;
        System.out.println("\nIMPOSTOS PAGOS: ");
        for (TaxPayer taxPayer : list) {
            double tax = taxPayer.tax();
            System.out.println(taxPayer.getName() + ": $ " + String.format("%.2f", tax));
            sum += tax;
        }

        System.out.printf("\nIMPOSTO TOTAL: %.2f", sum);

        sc.close();
    }
}
