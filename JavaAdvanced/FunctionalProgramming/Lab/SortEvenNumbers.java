package JavaAdvanced.FunctionalProgramming.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SortEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(", ")).map(Integer :: parseInt)
            .collect(Collectors.toList());
        
        numbers.removeIf(num -> num % 2 != 0);
        for (int item : numbers) {
            if(item == numbers.get(numbers.size() - 1)){
                System.out.print(item);
            } else {
                System.out.print(item + ", ");
            }
        }
        numbers.sort(Integer :: compareTo);;
        System.out.println();

        for (int item : numbers) {
            if(item == numbers.get(numbers.size() - 1)){
                System.out.print(item);
            } else {
                System.out.print(item + ", ");
            }
        }
    }
}
