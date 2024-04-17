import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        String nome = "MARIA";
        int idade = 32;
        double renda = 4000.0;

        System.out.printf("%s tem %d e ganha %.2f", nome, idade, renda);

    }
}
