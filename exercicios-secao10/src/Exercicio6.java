import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Quantos valores vai ter cada vetor? ");
        n = sc.nextInt();

        int[] vet1 = new int[n];
        int[] vet2 = new int[n];
        int[] vet3 = new int[n];

        System.out.println("Digite os valores do vetor A");
        for (int i = 0; i < n; i++)
            vet1[i] = sc.nextInt();

        System.out.println("Digite os valores do vetor B");
        for (int i = 0; i < n; i++)
            vet2[i] = sc.nextInt();

        for (int i = 0; i < n; i++)
            vet3[i] = vet1[i] + vet2[i];

        for (int valor : vet3)
            System.out.println("VALOR RESULTANTE: " + valor);

        sc.close();
    }
}
