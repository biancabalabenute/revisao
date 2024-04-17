public class Vetor05 {
    public static void main(String[] args) {
        int vet1[] = {1, 2, 3, 4};
        int vet2[] = {2, 3, 4, 5};
        int vet3[] = new int[vet1.length];

        for (int i = 0; i < vet1.length; i++) {
            vet3[i] = vet1[i] + vet2[i];
            System.out.print(vet3[i] + " ");
        }
    }
}
