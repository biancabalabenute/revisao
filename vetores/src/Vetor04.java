import java.util.Arrays;

public class Vetor04 {
    public static void main(String[] args) {
        int vet[] = {3, 7, 6, 1, 9, 4, 2};

        //busca binaria, divide o vetor em 2 partes e ve em qual esta, e repete até achar o numero solicitado
        int position = Arrays.binarySearch(vet, 1);

        for (int busca : vet)
            System.out.print(busca + " ");

        System.out.printf("\nEncontrei o valor na posição: %d", position + 1);
    }
}
