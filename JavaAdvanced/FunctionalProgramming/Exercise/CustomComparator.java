package JavaAdvanced.FunctionalProgramming.Exercise;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class CustomComparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .boxed()
                        .toArray(Integer[]::new);

        Comparator<Integer> comparator = (first, second) -> {
            if(first % 2 == 0 && second % 2 != 0){
                return -1;
            } else if(first % 2 != 0 && second % 2 == 0){
                return 1;
            }
            return first.compareTo(second);
        };

        Arrays.sort(numbers, comparator);
        Arrays.stream(numbers).forEach(item -> System.out.print(item + " "));
    }
}
