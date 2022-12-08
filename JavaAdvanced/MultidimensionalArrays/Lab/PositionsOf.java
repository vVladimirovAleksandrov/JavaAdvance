package JavaAdvance.JavaAdvanced.MultidimensionalArrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class PositionsOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] metrixInfo = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer :: parseInt).toArray();
        int rowMatrix = metrixInfo[0];

        int[][] matrix = new int[rowMatrix][];
        for(int row = 0; row < matrix.length; row++){
            int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer :: parseInt).toArray();
            matrix[row] = arr;
        }
        int searchNumber = Integer.valueOf(scanner.nextLine());

        boolean isFound = false;

        for(int row = 0; row < matrix.length; row++){
            for(int col = 0; col < matrix[row].length; col++){
                if(matrix[row][col] == searchNumber){
                    System.out.println(row + " " + col);
                    isFound = true;
                }
            }
        }

        if(!isFound){
            System.out.println("not found");
        }
    }
}
