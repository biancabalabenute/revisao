package exerciciosSecao08.exercicio01.application;

import exerciciosSecao08.exercicio01.entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com a largura e altura: ");
        Rectangle rect = new Rectangle();
        rect.width = sc.nextDouble();
        rect.height = sc.nextDouble();

        System.out.printf("\nArea: %.2f", rect.area());
        System.out.printf("\nPerimetro: %.2f", rect.perimeter());
        System.out.printf("\nDiagonal: %.2f", rect.diagonal());

        sc.close();
    }
}
