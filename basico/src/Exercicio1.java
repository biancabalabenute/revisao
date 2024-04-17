import java.util.Locale;

public class Exercicio1 {
    public static void main(String[] args) {
        String product1 = "Computador";
        String product2 = "Mesa de escritório";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.println("Produtos: ");
        System.out.printf("%s com o preço R$ %.2f \n", product1, price1);
        System.out.printf("%s com o preço R$ %.2f \n", product2, price2);

        System.out.printf("\nRegistro: \n%d anos de idade, codigo %d e gênero %s \n", age, code, gender);

        System.out.printf("\nMedida com oito numero decimais: %f\n", measure);
        System.out.printf("Arredondado (com três casas decimais): %.3f\n", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("Ponto decimal US %.3f\n", measure);

    }
}
