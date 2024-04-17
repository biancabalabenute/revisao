package exerciciosSecao08.exercicio03.application;

import exerciciosSecao08.exercicio03.entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        student.name = sc.nextLine();
        student.grade1 = sc.nextDouble();
        student.grade2 = sc.nextDouble();
        student.grade3 = sc.nextDouble();

        System.out.printf("\nNota final: %.2f", student.finalGrade());

        if (student.finalGrade() < 60.0) {
            System.out.println("\nReprovado");
            System.out.printf("Precisa de %.2f pontos", student.missingPoints());
        } else
            System.out.println("\nAprovado!");

        sc.close();
    }
}
