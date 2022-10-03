package JavaAdvanced.MultidimensionalArrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[size][];
        for (int row = 0; row < matrix.length; row++) {
            int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer :: parseInt).toArray();
            matrix[row] = arr;
        }
        int primaryDiagonalSum = primaryDiagonalSum(matrix);
        int secondaryDiagonalSum = secondaryDiagonalSum(matrix);
        System.out.println(Math.abs(primaryDiagonalSum - secondaryDiagonalSum));
    }

    static int secondaryDiagonalSum(int[][] matrix){
        int sum = 0;

        for(int row = matrix.length - 1, col = 0; row >= 0; row--, col++){
            sum += matrix[row][col];
        }

        return sum;
    }

    static int primaryDiagonalSum(int[][] matrix){
        int sum = 0;

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if(row == col){
                    sum += matrix[row][col];
                }
            }
        }

        return sum;
    }
}
