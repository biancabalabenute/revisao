import java.util.Locale;
import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, homens = 0, mulheres = 0;
        double maiorAltura, menorAltura, alturaMulheres = 0.0, alturaMF;

        System.out.print("Quantas pessoas serao digitadas? ");
        n = sc.nextInt();

        double[] altura = new double[n];
        char[] genero = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Altura da %da pessoa: ", i + 1);
            altura[i] = sc.nextDouble();
            System.out.printf("Genero da %da pessoa: ", i + 1);
            genero[i] = sc.next().charAt(0);
        }

        maiorAltura = altura[0];
        menorAltura = altura[0];

        for (int i = 0; i < n; i++)
            if (altura[i] > maiorAltura)
                maiorAltura = altura[i];

        for (int i = 0; i < n; i++)
            if (altura[i] < menorAltura)
                menorAltura = altura[i];

        for (int i = 0; i < n; i++) {
            if (genero[i] == 'M')
                homens++;
            else {
                mulheres++;
                alturaMulheres += altura[i];
            }
        }

        alturaMF = alturaMulheres / mulheres;

        System.out.printf("Menor altura= %.2f", menorAltura);
        System.out.printf("\nMaior altura= %.2f", maiorAltura);
        System.out.printf("\nMedia das alturas das mulheres= %.2f", alturaMF);
        System.out.printf("\nNumero de homens %d", homens);

        sc.close();
    }
}
