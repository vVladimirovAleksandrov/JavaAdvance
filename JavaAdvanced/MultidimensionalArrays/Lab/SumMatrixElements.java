package JavaAdvanced.MultidimensionalArrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class SumMatrixElements{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] size = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer :: parseInt).toArray();

        int[][] matrix = new int[size[0]][];
        for(int i = 0; i < matrix.length; i++){
            int[] arr = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer :: parseInt).toArray();
            matrix[i] = arr;
        }

        System.out.println(size[0]);//rows
        System.out.println(size[1]);//cols

        int sum = 0;
        for(int row = 0; row < matrix.length; row++){
            for(int col = 0; col < matrix[row].length; col++){
                sum += matrix[row][col];
            }
        }
        System.out.println(sum);
    }
}