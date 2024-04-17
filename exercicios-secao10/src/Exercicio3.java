import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();

        String[] nomes = new String[n];
        int[] idades = new int[n];
        double[] alturas = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Dados da %da pessoa: ", (i + 1));
            System.out.print("\nNome: ");
            nomes[i] = sc.next();
            System.out.print("Idade: ");
            idades[i] = sc.nextInt();
            System.out.print("Altura: ");
            alturas[i] = sc.nextDouble();
        }

        double somaAltura = 0.0;
        for (int i = 0; i < n; i++) {
            somaAltura += alturas[i];
        }

        double mediaAlturas = somaAltura / n;
        System.out.printf("\nAltura Média: %.2f", mediaAlturas);

        int cont = 0;
        for (int i = 0; i < n; i++) {
            if (idades[i] < 16)
                cont += 1;
        }

        double porcentagem = cont * 100.0 / n;
        System.out.printf("\nPessoas com menos de 16 anos: %.2f%%\n", porcentagem);

        for (int i = 0; i < n; i++) {
            if (idades[i] < 16)
                System.out.println(nomes[i]);
        }

        sc.close();
    }
}
