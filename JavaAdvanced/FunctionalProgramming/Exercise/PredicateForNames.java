package JavaAdvanced.FunctionalProgramming.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateForNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nameLenght = Integer.parseInt(scanner.nextLine());

        Predicate<String> isRight = name -> name.length() <= nameLenght;

        List<String> names = Arrays.stream(scanner.nextLine().split(" ")).filter(isRight).collect(Collectors.toList());
        names.forEach(item -> System.out.println(item + " "));
    }
}
