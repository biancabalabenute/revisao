import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codp1, codp2, qtdp1, qtdp2;
        double valp1, valp2, total;

        codp1 = sc.nextInt();
        qtdp1 = sc.nextInt();
        valp1 = sc.nextDouble();

        codp2 = sc.nextInt();
        qtdp2 = sc.nextInt();
        valp2 = sc.nextDouble();

        total = (qtdp1 * valp1) + (qtdp2 * valp2);

        System.out.printf("VALOR A PAGAR = %.2f", total);
        sc.close();
    }
}
