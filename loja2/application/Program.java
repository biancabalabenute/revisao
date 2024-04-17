package loja2.application;

import loja2.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com os dados do produto: ");
        System.out.print("Nome: ");
        String name = sc.nextLine();
        System.out.print("Preço: ");
        double price = sc.nextDouble();
        Product product = new Product(name, price);

        product.setName("Computador");
        System.out.println("Nome atualizado: " + product.getName());

        System.out.println("\nDados do produto: " + product);
        System.out.println("\nEntre com o numero de produtos para ser adicionado no estoque: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);
        System.out.println("\nDados atualizados: " + product);

        System.out.println("\nEntre com o numero de produtos para ser removido do estoque: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);
        System.out.println("\nDados atualizados: " + product);

        sc.close();
    }
}
