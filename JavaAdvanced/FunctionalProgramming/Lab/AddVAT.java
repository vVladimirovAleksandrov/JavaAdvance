package JavaAdvanced.FunctionalProgramming.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class AddVAT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        UnaryOperator<Double> addVat = value -> value * 1.2;

        List<Double> nums = Arrays.stream(scanner.nextLine().split(", ")).map(Double :: parseDouble)
                .collect(Collectors.toList());

        System.out.println("Prices with VAT:");
        for (Double item : nums) {
            double price = addVat.apply(item);
            System.out.printf("%.2f\n", price);
        }
    }
}
