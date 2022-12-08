package JavaAdvance.JavaAdvanced.SetsAndMapsAdvanced.Exercise;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Character, Integer> countWords = new TreeMap<>();

        String input = scanner.nextLine();
        for (int i = 0; i < input.length(); i++) {
            countWords.putIfAbsent(input.charAt(i), 0);
            countWords.put(input.charAt(i), countWords.get(input.charAt(i)) + 1);
        }

        for (char item : countWords.keySet()) {
            System.out.printf("%s: %d time/s\n", item, countWords.get(item));
        }
    }
}
