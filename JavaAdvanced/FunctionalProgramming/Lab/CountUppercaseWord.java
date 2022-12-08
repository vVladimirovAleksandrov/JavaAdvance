package JavaAdvance.JavaAdvanced.FunctionalProgramming.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CountUppercaseWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Predicate<String> checkUpperCase = word -> Character.isUpperCase(word.charAt(0));

        List<String> text = Arrays.stream(scanner.nextLine().split(" "))
                .filter(e -> checkUpperCase.test(e)).collect(Collectors.toList());

        System.out.println(text.size());
        text.forEach(e -> System.out.println(e));
    }
}
