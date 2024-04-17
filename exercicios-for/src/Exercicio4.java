import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();

            if (b != 0) {
                double divisao = a / b;
                System.out.printf("Divisão: %.2f", divisao);
            } else
                System.out.println("Divisão impossivel");
        }

        sc.close();
    }
}
