import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valor = sc.nextInt();
        int soma = 0;

        while (valor != 0) {
            soma = soma + valor;
            valor = sc.nextInt();
        }

        System.out.printf("O valor da soma é: %d", soma);

        sc.close();
    }
}
