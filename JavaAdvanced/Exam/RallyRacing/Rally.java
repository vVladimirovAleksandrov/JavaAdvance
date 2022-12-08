package JavaAdvance.JavaAdvanced.Exam.RallyRacing;

import java.rmi.MarshalException;
import java.util.Scanner;

public class Rally {

    public static int carRow = 0;
    public static int carCol = 0;
    public static boolean hasWon = false;
    public static int distance = 0;

    public static int[] startTunel = new int[2];
    public static int[] endTunel = new int[2];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());
        String raceNumber = scanner.nextLine();
        

        String[][] matrix = new String[size][size];
        for (int i = 0; i < size; i++) {
            String arr = scanner.nextLine();
            matrix[i] = arr.split(" ");
        }
        findTunel(matrix);

        String input = scanner.nextLine();
        while(!input.equals("End") || hasWon) {
            if(hasWon) break;

            distance += 10;

            if(input.equals("up")) {
                movePlayer(matrix, -1, 0);
            } else if(input.equals("down")) {
                movePlayer(matrix, +1, 0);
            } else if(input.equals("left")) {
                movePlayer(matrix, 0, -1);
            } else if(input.equals("right")) {
                movePlayer(matrix, 0, +1);
            }
            input = scanner.nextLine();
        }

        if(hasWon) {
            System.out.printf("Racing car %s finished the stage!\n", raceNumber);
        } else {
            System.out.printf("Racing car %s DNF.\n", raceNumber);
        }

        System.out.printf("Distance covered %d km.\n", distance);
        print(matrix);
    }

    private static void movePlayer(String[][] matrix, int rowMutator, int colMutator) {
        int nextRow = carRow + rowMutator;
        int nextCol = carCol + colMutator;

        
        
        if(matrix[nextRow][nextCol] == "T") {
            matrix[carRow][carCol] = ".";
            matrix[nextRow][nextCol] = ".";
            if(nextRow == startTunel[0] && nextCol == startTunel[1]){

                carRow = endTunel[0];
                carCol = endTunel[1];
                matrix[carRow][carCol] = "C";
            } else {
                carRow = startTunel[0];
                carCol = startTunel[1];
                matrix[carRow][carCol] = "C";
            }
            distance += 20;
        } else if(matrix[nextRow][nextCol] == "F") {
            hasWon = true;
            matrix[carRow][carCol] = "C";
            
        } else {
            matrix[carRow][carCol] = ".";
            matrix[nextRow][nextCol] = "C";
            carRow = nextRow;
            carCol = nextCol;
        }
    }

    static void findTunel(String[][] matrix) {
        int[] cordinates = new int[4];
        int count = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if(matrix[row][col].equals("T")) {
                    cordinates[count] = row;
                    count++;
                    cordinates[count] = col;
                    count++;
                }
            }
        }
        startTunel[0] = cordinates[0];
        startTunel[1] = cordinates[1];

        endTunel[0] = cordinates[2];
        endTunel[1] = cordinates[3];
    }

    static void print(String[][] matrix) {
        for (String[] chars : matrix) {
            for (String c : chars) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
