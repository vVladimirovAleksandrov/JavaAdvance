package JavaAdvanced.SetsAndMapsAdvanced.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class AverageStudentsGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<Double>> students = new TreeMap<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            String name = input[0];
            double grade = Double.valueOf(input[1]);

            students.putIfAbsent(name, new ArrayList<>());
            students.get(name).add(grade);
        }
        
        students.entrySet()
        .stream()
        .forEach(entry -> {
            double sum = 0;
            for (int i = 0; i < entry.getValue().size(); i++) {
                sum += entry.getValue().get(i);
            }
            double avgSum = sum / entry.getValue().size();

            System.out.print(entry.getKey() + " -> ");
            entry.getValue().forEach(e -> System.out.printf("%.2f ", e));
            System.out.printf("(avg: %.2f)%n", avgSum);
        });
    }
}
