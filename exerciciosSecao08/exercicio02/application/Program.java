package exerciciosSecao08.exercicio02.application;

import exerciciosSecao08.exercicio02.entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();
        System.out.print("Nome: ");
        employee.name = sc.nextLine();
        System.out.print("Salario bruto: ");
        employee.grossSalary = sc.nextDouble();
        System.out.print("Imposto: ");
        employee.tax = sc.nextDouble();

        System.out.println("Funcionario: " + employee);
        System.out.print("\nQuantos % vai aumentar o salario? ");
        double percentage = sc.nextDouble();
        employee.increaseSalary(percentage);
        System.out.println("\nDados atualizados: " + employee);

        sc.close();
    }
}
