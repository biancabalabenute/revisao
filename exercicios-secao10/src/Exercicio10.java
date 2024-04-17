import java.util.Locale;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Quantos alunos serão digitados? ");
        n = sc.nextInt();

        String[] nomes = new String[n];
        double[] nota1 = new double[n];
        double[] nota2 = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite nome, primeira e segunda nota do 1o aluno: ");
            sc.nextLine();
            nomes[i] = sc.nextLine();
            nota1[i] = sc.nextDouble();
            nota2[i] = sc.nextDouble();
        }

        double media = 0.0;

        System.out.println("Alunos aprovados");
        for (int i = 0; i < n; i++) {
            media = (nota1[i] + nota2[i]) / 2;
            if (media >= 6)
                System.out.println(nomes[i]);
        }

        sc.close();
    }
}
