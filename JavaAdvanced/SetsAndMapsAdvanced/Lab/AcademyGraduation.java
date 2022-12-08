package JavaAdvance.JavaAdvanced.SetsAndMapsAdvanced.Lab;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class AcademyGraduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Double> studentsGrade = new TreeMap<>();

        int count  = Integer.parseInt(scanner.nextLine());
        while(count-- > 0){
            String name = scanner.nextLine();
            double[] grades = Arrays.stream(scanner.nextLine().split(" ")).mapToDouble(Double :: parseDouble).toArray();
            double avg = sumAvg(grades);

            studentsGrade.putIfAbsent(name, null);
            studentsGrade.put(name, avg);
        }

        DecimalFormat format = new DecimalFormat("###.####################");
        studentsGrade.forEach((name, grade) -> System.out.printf("%s is graduated with %s\n", name, format.format(grade)));
    }
 
    static double sumAvg(double[] nums){
        double sum = 0;
        for (double item : nums) {
            sum += item;
        }

        return sum / nums.length;
    }
}
