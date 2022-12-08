package JavaAdvance.JavaAdvanced.MultidimensionalArrays.Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PrintDiagonalOfSquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sizeMatrix = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[sizeMatrix][];
        for(int i = 0; i < matrix.length; i++){
            int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer :: parseInt).toArray();
            matrix[i] = arr;
        }

        List<Integer> diagonal = new ArrayList<>();
        for(int row = 0; row < matrix.length; row++){
            diagonal.add(matrix[row][row]);
        }

        List<Integer> secondDiagonal = new ArrayList<>();
        for(int row = matrix.length - 1, index = 0; row >= 0; row--, index++){
            secondDiagonal.add(matrix[row][index]);
        }

        for (Integer item : diagonal) {
            System.out.print(item + " ");
        }
        System.out.println();
        for (Integer item : secondDiagonal) {
            System.out.print(item + " ");
        }
    }
}
