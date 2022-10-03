package JavaAdvanced.MultidimensionalArrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] limitation = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer :: parseInt).toArray();
        String[][] matrix = assignMatrix(limitation[0], limitation[1]);
        printMatrix(matrix);

        
    }

    static String[][] assignMatrix(int row, int col){
        String[][] matrix = new String[row][col];

        for (int r = 0; r < row; r++) {
            for (int c = 0; c < col; c++) {
                String input = (char)('a' + r) + "" + (char)('a' + r + c) + "" + (char)('a' + r);
                matrix[r][c] = input;

            }
        }

        return matrix;
    }

    static void printMatrix(String[][] matrix){
        for (String[] arr: matrix) {
            for (String item : arr) {
                System.out.print(item + " ");
            }
            System.out.println();
        }
    }
}
