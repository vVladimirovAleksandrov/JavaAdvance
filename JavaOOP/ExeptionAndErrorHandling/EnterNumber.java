package JavaAdvance.JavaOOP.ExeptionAndErrorHandling;

import java.util.ArrayList;
import java.util.IllegalFormatException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class EnterNumber {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());

        List<Integer> elements = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            String input = scanner.nextLine();

            try{
                int curNum = Integer.parseInt(scanner.nextLine());

                if(elements.get(i) < curNum && curNum < 100) {
                    elements.add(curNum);
                } else {
                    System.out.printf("Your number is not in range (%d - 100)", elements.get(i));
                }
            } catch (IllegalFormatException ex){
                throw new Exception("Invalid Number!");
            }


        }

        for (int i = 0; i < elements.size(); i++) {
            if(elements.get(i) == elements.get(elements.size() - 1)){
                System.out.print(elements.get(i));
            } else {
                System.out.print(elements.get(i) + ",");

            }
        }

//        while (true) {
//            try {
//                int start = Integer.parseInt(scanner.nextLine());
//                int end = Integer.parseInt(scanner.nextLine());
//
//                printRange(start, end);
//            } catch (NumberFormatException e) {
//                System.out.println("Please enter valid integers");
//            } catch (IllegalArgumentException e) {
//                System.out.println(e.getMessage());
//            }
//        }
    }

    public static void printRange(int start, int end) {
        try {
            validateRange(start, end);
        } catch (InvalidRangeException e) {
            throw new IllegalArgumentException(e.getMessage(), e);
        }

        IntStream.rangeClosed(start, end)
                .forEach(System.out::println);
    }

    private static void validateRange(int start, int end) throws InvalidRangeException {
        if (start <= 1 || start >= end || end >= 100) {
            throw new InvalidRangeException("The range should be 1 < start < end < 100");
        }
    }

    private static class InvalidRangeException extends Exception {

        public InvalidRangeException(String message) {
            super(message);
        }
    }
}
