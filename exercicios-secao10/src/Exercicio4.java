import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar: ");
        int n = sc.nextInt();

        int[] num = new int[n];

        for (int i = 0; i < num.length; i++) {
            System.out.print("Digite um numero: ");
            num[i] = sc.nextInt();
        }

        System.out.println("Numero pares: ");
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0)
                System.out.printf("%d ", num[i]);
        }

        int cont = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0)
                cont += 1;
        }
        System.out.println("\nQuantidade de numero pares: " + cont);
        sc.close();
    }
}
