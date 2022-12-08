package JavaAdvance.JavaAdvanced.ExamPrep.ReVolt;

import java.util.Scanner;

import javax.security.auth.login.CredentialException;

public class MatrixGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());
        int commandsLines = Integer.parseInt(scanner.nextLine());

        char[][] matrix = new char[N][N];
        for(int i = 0; i < N; i++) {
            char[] arr = scanner.nextLine().toCharArray();
            matrix[i] = arr;
        }

        while(commandsLines-- > 0){
            String input = scanner.nextLine();

            switch(input) {
                case "up":
                    matrix = moveUp(matrix);
                    printMatrix(matrix);
                    break;

                case "down":
                    matrix = moveDown(matrix);
                    printMatrix(matrix);
                    break;

                case "left":
                    matrix = moveLeft(matrix);
                    printMatrix(matrix);
                    break;

                case "right":
                    matrix = moveRight(matrix);
                    printMatrix(matrix);
                    break;
            }
        }
    }

    private static char[][] moveRight(char[][] matrix) {
        char[][] result = matrix;

        int[] cordinates = whereIsThePlayer(matrix);
        int row = cordinates[0];
        int col = cordinates[1];

        if(result[row][col + 1] == 'B') {//ako stypi na bonus
            if(isInBounds(result, row, col + 2)){
                char swap = result[row][col];
                result[row][col] = '-';
                result[row][col + 2] = swap;
            } else {
                char swap = result[row][col];
                result[row][col] = '-';
                result[row][0] = swap;
            }
        } else if(result[row][col + 1] == 'T') {
            
        } else {
            if(isInBounds(matrix, row, col + 1)){
                char swap = result[row][col];
                result[row][col] = '-';
                result[row][col + 1] = swap;
            } else {
                char swap = result[row][col];
                result[row][col] = '-';
                result[row][0] = swap;
            }
        }

        return result;
    }

    private static char[][] moveLeft(char[][] matrix) {
        char[][] result = matrix;

        int[] cordinates = whereIsThePlayer(matrix);
        int row = cordinates[0];
        int col = cordinates[1];

        if(result[row][col - 1] == 'B') {//ako stypi na bonus
            if(isInBounds(result, row, col - 2)){
                char swap = result[row][col];
                result[row][col] = '-';
                result[row][col - 2] = swap;
            } else {
                char swap = result[row][col];
                result[row][col] = '-';
                result[row][result[row].length - 1] = swap;
            }
        } else if(result[row][col + 1] == 'T') {

        } else {
            if(isInBounds(matrix, row, col - 1)){
                char swap = result[row][col];
                result[row][col] = '-';
                result[row][col - 1] = swap;
            } else {
                char swap = result[row][col];
                result[row][col] = '-';
                result[row][result[row].length - 1] = swap;
            }
        }

        return result;
    }

    private static char[][] moveDown(char[][] matrix) {
        char[][] result = matrix;

        int[] cordinates = whereIsThePlayer(matrix);
        int row = cordinates[0];
        int col = cordinates[1];

        if(isInBounds(matrix, row + 1, col)) {
            char swap = result[row][col];
            result[row][col] = '-';
            result[row + 1][col] = swap;
        } else {
            char swap = result[row][col];
            result[row][col] = '-';
            result[0][col] = swap;
        }

        return result;
    }

    private static char[][] moveUp(char[][] matrix) {
        char[][] result = matrix;

        int[] cordinates = whereIsThePlayer(matrix);
        int row = cordinates[0];
        int col = cordinates[1];

        if(isInBounds(matrix, row - 1, col)){
            char swap = result[row][col];
            result[row][col] = '-';
            result[row - 1][col] = swap;
        } else {
            char swap = result[row][col];
            result[row][col] = '-';
            result[matrix.length - 1][col] = swap;
        }

        return result;
    }

    static int[] whereIsThePlayer(char[][] matrix) {
        int[] cordinates = new int[2];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if(matrix[row][col] == 'f'){
                    cordinates[0] = row;
                    cordinates[1] = col;
                }
            }
        }

        return cordinates;
    }

    static int[] winerField(char[][] matrix) {
        int[] cordinates = new int[2];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if(matrix[row][col] == 'F'){
                    cordinates[0] = row;
                    cordinates[1] = col;
                }
            }
        }

        return cordinates;
    }

    static int[] trap(char[][] matrix) {
        int[] cordinates = new int[2];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if(matrix[row][col] == 'T'){
                    cordinates[0] = row;
                    cordinates[1] = col;
                }
            }
        }

        return cordinates;
    }

    static int[] bonus(char[][] matrix) {
        int[] cordinates = new int[2];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if(matrix[row][col] == 'B'){
                    cordinates[0] = row;
                    cordinates[1] = col;
                }
            }
        }

        return cordinates;
    }

    static void printMatrix(char[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }
    }

    private static boolean isInBounds(char[][] matrix, int row, int col) {
        return row >= 0 && row < matrix.length && col >= 0 && col < matrix[row].length;
    }
}
