package appliaction;

import services.BrazilInterestService;
import services.InterestService;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor: ");
        double amount = sc.nextDouble();
        System.out.print("Meses: ");
        int mounths = sc.nextInt();

        InterestService is = new BrazilInterestService(2.0);
        double payment = is.payment(amount, mounths);

        System.out.println("Pagamento depois de " + mounths + " meses");
        System.out.println(String.format("%.2f", payment));
    }
}
