import java.util.Arrays;

public class Vetor03 {
    public static void main(String[] args) {
        int vet[] = {7,5,3,9,1};

        Arrays.sort(vet);
        for (int valor : vet)
            System.out.println(valor);
    }
}
