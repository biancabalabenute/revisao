import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int num, horas;
        double valorHora, salario;

        num = sc.nextInt();
        horas = sc.nextInt();
        valorHora = sc.nextDouble();

        salario = horas * valorHora;

        System.out.printf("NUMERO = %d\n", num);
        System.out.printf("SALARIO = %.2f", salario);
        sc.close();
    }
}
