import java.util.Locale;
import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Quantos elementos vai ter o vetor? ");
        n = sc.nextInt();

        double[] vet = new double[n];
        double media = 0.0;

        for (int i = 0; i < vet.length; i++) {
            System.out.print("Digite um numero: ");
            vet[i] = sc.nextDouble();
            media += vet[i];
        }

        media = media / n;
        System.out.printf("MEDIA DO VETOR = %.3f\n", media);

        System.out.println("ELEMENTO ABAIXO DA MEDIA: ");
        for (int i = 0; i < vet.length; i++)
            if (vet[i] < media)
                System.out.println(vet[i]);

        sc.close();
    }
}
