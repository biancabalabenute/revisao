import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Quantas pessoas voce vai digitar? ");
        n = sc.nextInt();

        String[] nomes = new String[n];
        int[] idade = new int[n];

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.printf("Dados da %da pessoa: \n", i + 1);
            System.out.print("Nome: ");
            nomes[i] = sc.nextLine();
            System.out.print("Idade: ");
            idade[i] = sc.nextInt();
        }

        int maiorIdade = idade[0];
        int posicaomaior = 0;

        for (int i = 1; i < n; i++)
            if (idade[i] > maiorIdade) {
                maiorIdade = idade[i];
                posicaomaior = i;
            }

        System.out.printf("PESSOA MAIS VELHA: %s\n", nomes[posicaomaior]);

        sc.close();
    }
}
