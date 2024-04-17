import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cod = sc.nextInt();
        int qtd = sc.nextInt();
        double total;

        if (cod == 1)
            total = qtd * 4.0;
        else if (cod == 2)
            total = qtd * 4.50;
        else if (cod == 3)
            total = qtd * 5.0;
        else if (cod == 4)
            total = qtd * 2.0;
        else
            total = qtd * 1.50;

        System.out.printf("TOTAL: R$ %.2f\n", total);

        sc.close();
    }
}
