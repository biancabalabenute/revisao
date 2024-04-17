package triangulo.application;

import triangulo.application.entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Entre com os dados do triangulo A: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Entre com os dados do triangulo B: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();

        double areaY = y.area();

        System.out.printf("Area A: %.4f\n", areaX);
        System.out.printf("Area B: %.4f\n", areaY);

        if (areaX > areaY)
            System.out.println("A é maior");
        else
            System.out.println("B é maior");

        sc.close();
    }
}
