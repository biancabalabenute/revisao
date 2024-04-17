import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        double[] vet = new double[n];
        for (int i = 0; i < vet.length; i++) {
            System.out.print("Digite um numero: ");
            vet[i] = sc.nextDouble();
        }

        double soma = 0.0;

        for (int i = 0; i < vet.length; i++) {
            soma += vet[i];
        }

        double media = soma / vet.length;

        System.out.print("VALORES = ");
        for (int i = 0; i < vet.length; i++) {
            System.out.printf("%.1f  ", vet[i]);
        }

        System.out.printf("\nSOMA = %.2f", soma);
        System.out.printf("\nMEDIA = %.2f", media);

        sc.close();
    }
}
