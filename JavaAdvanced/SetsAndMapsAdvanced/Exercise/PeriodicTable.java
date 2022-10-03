package JavaAdvanced.SetsAndMapsAdvanced.Exercise;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> chemicals = new TreeSet<>();

        int count = Integer.parseInt(scanner.nextLine());
        while(count-- > 0){
            String[] input = scanner.nextLine().split(" ");

            for (String item : input) {
                chemicals.add(item);
            }
        }

        for (String item: chemicals) {
            System.out.print(item + " ");
        }
    }
}
