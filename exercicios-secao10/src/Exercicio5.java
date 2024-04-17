import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, pm = 0;
        double maior;

        System.out.print("Quantos numeros voce vai digitar? ");
        n = sc.nextInt();
        double[] vet = new double[n];

        for (int i = 0; i < vet.length; i++) {
            System.out.print("Digite um numero: ");
            vet[i] = sc.nextDouble();
        }

        maior = vet[0];
        for (int i = 0; i < vet.length; i++)
            if (vet[i] > maior) {
                maior = vet[i];
                pm = i;
            }

        System.out.printf("\nMAIOR VALOR = %.2f", maior);
        System.out.printf("\nPOSIÇÃO DO MAIOR VALOR = %d", pm);

        sc.close();
    }
}
