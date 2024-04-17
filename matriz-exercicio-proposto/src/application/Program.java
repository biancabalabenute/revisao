package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com o numero de linhas e em seguida o numero de colunas: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int[][] mat = new int[a][b];

        for (int l = 0; l < mat.length; l++)
            for (int c = 0; c < mat[l].length; c++)
                mat[l][c] = sc.nextInt();

        System.out.print("Digite o numero que deseja buscar: ");
        int x = sc.nextInt();

        for (int l = 0; l < mat.length; l++)
            for (int c = 0; c < mat[l].length; c++)
                if (mat[l][c] == x) {
                    System.out.println("\nPosição " + l + ", " + c + ":");
                    if (c > 0)
                        System.out.println("Esquerda: " + mat[l][c - 1]);
                    if (l > 0)
                        System.out.println("Acima: " + mat[l - 1][c]);
                    if (c < mat[l].length - 1)
                        System.out.println("Direita: " + mat[l][c + 1]);
                    if (l < mat.length - 1)
                        System.out.println("Abaixo: " + mat[l + 1][c]);
                }

        sc.close();
    }
}
