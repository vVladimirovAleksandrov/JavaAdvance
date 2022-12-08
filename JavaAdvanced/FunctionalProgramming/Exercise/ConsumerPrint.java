package JavaAdvance.JavaAdvanced.FunctionalProgramming.Exercise;

import java.security.MessageDigest;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ConsumerPrint {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        List<String> names = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        Consumer<String> print = massege -> System.out.println(massege.trim());
        names.forEach(e -> print.accept(e));
    }
}
