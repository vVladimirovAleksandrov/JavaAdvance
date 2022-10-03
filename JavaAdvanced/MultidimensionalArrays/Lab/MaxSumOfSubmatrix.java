package JavaAdvanced.MultidimensionalArrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSumOfSubmatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] size = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer :: parseInt).toArray();

        int[][] matrix = new int[size[0]][];
        for(int i = 0; i < matrix.length; i++){
            int[] arr = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer :: parseInt).toArray();
            matrix[i] = arr;
        }

        int bestSum = Integer.MIN_VALUE;
        int resultRow;
        int resultCol;
        for(int row = 0; row < matrix.length - 1; row++){
            for(int col = 0; col < matrix[row].length - 1; col++){
                int sum = matrix[row][col] + matrix[row][col + 1] + matrix[row + 1][col] + matrix[row + 1][col + 1];
                if(sum > bestSum){
                    bestSum = sum;
                    resultRow = row;
                    resultCol = col;
                }
            }
            System.out.println();
        }
    }
}
