package application;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account account;

        System.out.print("Entre com o número da conta: ");
        int number = sc.nextInt();
        System.out.print("Entre com o nome do titular: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.println("Deseja fazer um deposito inicial? (s/n)");
        char resposta = sc.next().charAt(0);

        if (resposta == 's') {
            System.out.print("Entre com o valor do deposito: ");
            double initialDeposit = sc.nextDouble();
            account = new Account(number, holder, initialDeposit);
        } else {
            account = new Account(number, holder);
        }

        System.out.println("Dados da conta: " + account);

        System.out.print("Entre com o valor do deposito: ");
        double valueDeposit = sc.nextDouble();
        account.deposit(valueDeposit);
        System.out.println("\nDados da conta atualizados: \n" + account);

        System.out.print("Entre com o valor do saque: ");
        double withdrawValue = sc.nextDouble();
        account.withdraw(withdrawValue);
        System.out.println("\nDados da conta atualizados: \n" + account);

        sc.close();
    }
}
