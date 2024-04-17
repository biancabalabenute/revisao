package exerciciosSecao08.exercicio04.application;

import exerciciosSecao08.exercicio04.util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual o preço do dolar? ");
        double dollarPrice = sc.nextDouble();
        System.out.print("\nQual o valor da compra? ");
        double amount = sc.nextDouble();
        double result = CurrencyConverter.dollarToReal(amount, dollarPrice);
        System.out.println("O valor da compra em dolar é: " + result);

        sc.close();
    }
}
