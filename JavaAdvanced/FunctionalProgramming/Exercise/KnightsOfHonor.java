package JavaAdvanced.FunctionalProgramming.Exercise;

import java.util.Scanner;
import java.util.function.Consumer;

import javax.naming.NamingException;

class KnightsOfHonor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Consumer<String> print = ms -> System.out.println("Sir " + ms);
        String[] names = scanner.nextLine().split(" ");
        for (String item : names) {
            print.accept(item);
        }
    }
}