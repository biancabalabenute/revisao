public class Vetor06 {
    public static void main(String[] args) {
        int vet[] = {10, 2, 89, 41, 22};

        int maior = vet[0];
        int menor = vet[0];

        for (int i = 1; i < vet.length; i++) {
            if (vet[i] > maior)
                maior = vet[i];
            else if (vet[i] < menor)
                menor = vet[i];
        }
        System.out.println("Maior " + maior);
        System.out.println("Menor " + menor);
    }
}
