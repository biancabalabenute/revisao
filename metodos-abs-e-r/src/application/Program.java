package application;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Shape> list = new ArrayList<>();
        System.out.print("Entre com o numero de figuras: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Entre com os dados da figura #" + i);
            System.out.print("Retangulo ou Circulo (r/c)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Cor (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.next());

            if (ch == 'r') {
                System.out.print("Largura: ");
                double widht = sc.nextDouble();
                System.out.print("Altura: ");
                double height = sc.nextDouble();
                list.add(new Rectangle(color, widht, height));
            } else {
                System.out.print("Raio: ");
                double radius = sc.nextDouble();
                list.add(new Circle(color, radius));
            }
        }
        System.out.println("Area das figuras: ");
        for (Shape shape : list)
            System.out.printf("\n%.2f", shape.area());

        sc.close();
    }
}
