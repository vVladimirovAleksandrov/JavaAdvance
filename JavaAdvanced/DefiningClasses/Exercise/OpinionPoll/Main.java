package JavaAdvance.JavaAdvanced.DefiningClasses.Exercise.OpinionPoll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Persson> perssons = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());
        while(n-- > 0){
            String[] info = scanner.nextLine().split(" ");

            Persson persson = new Persson(info[0], Integer.parseInt(info[1]));
            perssons.add(persson);
        }

        perssons
                .stream()
                .filter(person -> person.getAge() > 30)
                .sorted((left, right) -> left.getName().compareTo(right.getName()))
                .forEach(item -> item.printPersson());
    }
}
