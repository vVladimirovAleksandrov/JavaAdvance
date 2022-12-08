package JavaAdvance.JavaAdvanced.MultidimensionalArrays.Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class WrongMeasurments {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sizeMatrix = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[sizeMatrix][];
        for(int i = 0; i < matrix.length; i++){
            int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer :: parseInt).toArray();
            matrix[i] = arr;
        }

        int[] indexess = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer :: parseInt).toArray();
        int valueToReplace = matrix[indexess[0]][indexess[1]];

        List<int[]> correctValues = new ArrayList<>();

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if(matrix[row][col] == valueToReplace){
                    int correctValue = getNearbySym(matrix, row, col, valueToReplace);
                    correctValues.add(new int[]{row, col, correctValue});
                }
            }
        }

        for (int[] item : correctValues) {
            int row = item[0];
            int col = item[1];
            matrix[row][col] = item[2];
        }

        for (int[] arr : matrix) {
            for (int item : arr) {
                System.out.print(item + " ");
            }
            System.out.println();
        }
    }

    private static int getNearbySym(int[][] matrix, int row, int col, int valueToReplace) {
        int sum = 0;

        if(isInBounds(matrix, row + 1, col) && matrix[row + 1][col] != valueToReplace) sum += matrix[row + 1][col];
        if(isInBounds(matrix, row - 1, col) && matrix[row - 1][col] != valueToReplace) sum += matrix[row - 1][col];
        if(isInBounds(matrix, row, col - 1) && matrix[row][col - 1] != valueToReplace) sum += matrix[row][col - 1];
        if(isInBounds(matrix, row, col + 1) && matrix[row][col + 1] != valueToReplace) sum += matrix[row][col + 1];

        return sum;
    }

    private static boolean isInBounds(int[][] matrix, int row, int col) {
        return row >= 0 && row < matrix.length && col >= 0 && col < matrix[row].length;
    }
    private static boolean isOutOfBounds(int[][] matrix, int row, int col){
        return !isInBounds(matrix, row, col);
    }
}
