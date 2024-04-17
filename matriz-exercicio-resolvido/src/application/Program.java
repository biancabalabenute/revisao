package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a dimenção que o vetor vai ter: ");
        int n = sc.nextInt();
        int[][] mat = new int[n][n];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.print("\nDiagonal principal: \n");
        for (int i = 0; i < mat.length; i++)
            System.out.print(mat[i][i] + " ");

        System.out.println("\nDiagonal secundaria: ");
        for (int i = 0; i < n; i++)
            System.out.print(mat[i][n - 1 - i] + " ");

        int count = 0;
        for (int i = 0; i < mat.length; i++)
            for (int j = 0; j < mat[i].length; j++)
                if (mat[i][j] < 0)
                    count++;

        System.out.print("\n\nNumeros negativos = " + count);

        sc.close();
    }
}
