package JavaAdvance.JavaOOP.ExeptionAndErrorHandling;

import java.util.Scanner;

public class NumberInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] range = scanner.nextLine().split(" ");
        int start = Integer.parseInt(range[0]);
        int end = Integer.parseInt(range[1]);
        System.out.printf("Range: [%d...%d]\n", start, end);

        int num = readNumberInRange(scanner, start, end);
        System.out.println("Valid number: " + num);
    }

    private static int readNumberInRange(Scanner scanner, int start, int end) {
        while (true) {
            String line = scanner.nextLine();
            try{
                int num = Integer.parseInt(line);
                if(num >= start && num <= end){
                    return num;
                }
            } catch (Exception ex) {
            }
            System.out.println("Invalid number: " + line);
        }
    }
}
