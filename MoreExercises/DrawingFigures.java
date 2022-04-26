package MoreExercises;
import java.util.Scanner;

public class DrawingFigures {
    //Romb
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for(int row = 1; row <= n; row++){

        }
    }

    public void FirstAndLastRow(int n){
        System.out.print("+ ");
        for(int i = 1; i <= n - 2; i++){
            System.out.print("- ");
        }
        System.out.print("+\n");
    }

    public void MidleRows(int n){
        for(int row = 1; row <= n - 2; row++){
            System.out.print("| ");
            for(int i = 1; i <= n - 2; i++){
                System.out.print("- ");
            }
            System.out.print("|");
            System.out.println();
        }
    }
}
