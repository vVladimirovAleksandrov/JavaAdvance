package JavaAdvance.JavaAdvanced.FunctionalProgramming.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(", ")).map(Integer :: parseInt)
            .collect(Collectors.toList());

        for (Integer item : numbers) {
            sum += item;
        }

        System.out.println("Count = " + numbers.size());
        System.out.println("Sum = " + sum);
    }
}
