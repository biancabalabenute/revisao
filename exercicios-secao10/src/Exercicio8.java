import java.util.Locale;
import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, par = 0;
        System.out.print("Quantos elementos vai ter o vetor? ");
        n = sc.nextInt();

        int[] vet = new int[n];

        for (int i = 0; i < vet.length; i++) {
            System.out.print("Digite um numero: ");
            vet[i] = sc.nextInt();
        }

        double mediaPar = 0.0;

        for (int i = 0; i < vet.length; i++)
            if (vet[i] % 2 == 0) {
                mediaPar += vet[i];
                par++;
            }

        mediaPar /= par;

        if (par >= 1)
            System.out.printf("MEDIA DOS PARES: %.2f", mediaPar);
        else
            System.out.println("NENHUM NUMERO PAR");

        sc.close();
    }
}
