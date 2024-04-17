import java.util.Locale;
import java.util.Scanner;

public class Ternario {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double preco = sc.nextDouble();
        double desconto = (preco < 20) ? preco * 0.1 : preco * 0.05;

        System.out.printf("Total: %.2f", desconto);
        sc.close();
    }
}
