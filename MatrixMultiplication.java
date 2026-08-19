package assignemntprograms;

import java.util.Scanner;

public class MatrixMultiplication {
    static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int r1 = matrix1.length;
        int r2 = matrix2.length;
        int c1 = matrix1[0].length;
        int c2 = matrix2[0].length;

        int[][] result = new int[r1][c2];

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    result[i][j] = result[i][j] + matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        return result;
    }

    static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input dimensions of first matrix
        System.out.print("Enter rows of first matrix: ");
        int r1 = sc.nextInt();

        System.out.print("Enter columns of first matrix: ");
        int c1 = sc.nextInt();

        // Input dimensions of second matrix
        System.out.print("Enter rows of second matrix: ");
        int r2 = sc.nextInt();

        System.out.print("Enter columns of second matrix: ");
        int c2 = sc.nextInt();

        // Check multiplication condition
        if (c1 != r2) {
            System.out.println("Matrix multiplication is not possible.");
            System.out.println("Columns of first matrix must equal rows of second matrix.");
            sc.close();
            return;
        }

        int[][] matrix1 = new int[r1][c1];
        int[][] matrix2 = new int[r2][c2];

        // Input first matrix
        System.out.println("Enter elements of first matrix:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }

        // Input second matrix
        System.out.println("Enter elements of second matrix:");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }

        // Call multiplication function
        int[][] result = multiplyMatrices(matrix1, matrix2);

        // Display result
        System.out.println("Resulting Matrix:");
        displayMatrix(result);

    }
}
