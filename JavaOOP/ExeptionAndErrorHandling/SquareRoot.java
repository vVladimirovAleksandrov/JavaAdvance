package JavaAdvance.JavaOOP.ExeptionAndErrorHandling;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try{
            int num = Integer.parseInt(scanner.nextLine());
            double sqrt = calcSqrt(num);
            System.out.printf("%.2f\n", sqrt);
        } catch (Exception ex) {
            System.out.println("Invalid");
        } finally {
            System.out.println("Goodbye");
        }
    }

    private static double calcSqrt(int num) {
        if(num < 0) {
            try {
                throw new Exception("Invalid");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } else {
            return Math.sqrt(num);
        }
    }
}
