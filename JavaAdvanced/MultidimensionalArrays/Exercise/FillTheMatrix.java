package JavaAdvance.JavaAdvanced.MultidimensionalArrays.Exercise;

import java.util.Scanner;

public class FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");
        int size = Integer.valueOf(input[0]);
        String pattern = input[1];

        int[][] matrix;
        switch(pattern){
            case "A": matrix = patternA(size);
                break;
            case "B": matrix = patternB(size);
                break;
            default: matrix = new int[size][size];
        }

        printMatrix(matrix);

    }

    static int[][] patternA(int size){
        int[][] matrix = new int[size][size];
        int num = 1;

        for(int col = 0; col < matrix.length; col++){
            for(int row = 0; row < matrix[col].length; row++){
                matrix[row][col] = num;
                num++;
            }
        }

        return matrix;
    }

    static int[][] patternB(int size){
        int[][] matrix = new int[size][size];
        int num = 1;

        for(int col = 0; col < size; col++){
            if(col % 2 == 0){
                for(int row = 0; row < size; row++){
                    matrix[row][col] = num;
                    num++;
                }
            } else {
                for (int row = size -1; row >= 0; row--) {
                    matrix[row][col] = num;
                    num++;
                }
            }
        }

        return matrix;
    }

    static void printMatrix(int[][] matrix){
        for (int[] arr : matrix) {
            for (int item : arr) {
                System.out.print(item + " ");
            }
            System.out.println();
        }
    }
}
