package JavaAdvanced.SetsAndMapsAdvanced.Lab;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Double, Integer> countNumbers = new LinkedHashMap<>();

        double[] input = Arrays.stream(scanner.nextLine().split(" "))
                .mapToDouble(Double :: parseDouble).toArray();

        for (double number : input) {
            countNumbers.putIfAbsent(number, 0);
            countNumbers.put(number, countNumbers.get(number) + 1);
        }

        for (double key : countNumbers.keySet()) {
            System.out.println(String.format("%.1f -> %d", key, countNumbers.get(key)));
        }
    }
}
