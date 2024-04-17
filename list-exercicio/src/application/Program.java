package application;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.print("Entre com o número de funcionários: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("\nFuncionario " + i + ": ");

            System.out.print("Id: ");
            int id = sc.nextInt();
            while (hasId(list, id)) {
                System.out.print("Este ID já existe. Tente novamente: ");
                id = sc.nextInt();
            }

            System.out.print("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salario: ");
            double salary = sc.nextDouble();

            list.add(new Employee(id, name, salary));

        }

        System.out.print("\nEntre com o ID do funcionario que vai receber o aumento: ");
        int id = sc.nextInt();
        Employee employee = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if (employee == null)
            System.out.println("Este funcionario não existe");
        else {
            System.out.print("Qual a porcentagem do aumento? ");
            double percentage = sc.nextDouble();
            employee.increaseSalary(percentage);
        }

        System.out.print("Lista dos empregados: \n");
        for (Employee obj : list)
            System.out.println(obj);

        sc.close();
    }

    public static boolean hasId(List<Employee> list, int id) {
        Employee employee = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return employee != null;
    }
}