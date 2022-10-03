package JavaAdvanced.FunctionalProgramming.Lab;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FilterByAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> peopleInfo = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());
        while(n-- > 0){
            String[] input = scanner.nextLine().split(", ");
            String name = input[0];
            int age = Integer.parseInt(input[1]);

            peopleInfo.putIfAbsent(name, null);
            peopleInfo.put(name, age);
        }

        String condition = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String format = scanner.nextLine();

        Predicate<Integer> tester = createTester(condition, age);
        Consumer<Map.Entry<String, Integer>> printer = createPrinter(format);
        printFilteredStudent(peopleInfo, tester, printer);
    }

    static Consumer<Map.Entry<String, Integer>> createPrinter(String format){
        Consumer<Map.Entry<String, Integer>> printer = null;

        switch(format) {
            case "name age":
                printer = person -> System.out.printf("%s - %d\n", person.getKey(), person.getValue());
                break;

            case "name":
                printer = person -> System.out.printf("%s\n", person.getKey());
                break;
            
            case "age":
                printer = person -> System.out.printf("%d\n", person.getValue());
                break;
        }
        return printer;
    }

    static Predicate<Integer> createTester(String condition, Integer age){
        Predicate<Integer> tester = null;

        switch(condition){
            case "younger":
                tester = x -> x <= age;
                break;

            case "older":
                tester = x -> x >= age;
                break;
        }
        return tester;
    }

    static void printFilteredStudent(Map<String, Integer> peopleInfo, Predicate<Integer> tester
            , Consumer<Map.Entry<String, Integer>> printer){
        for(Map.Entry<String, Integer> person : peopleInfo.entrySet()){
            if(tester.test(peopleInfo.get(person.getKey()))){
                printer.accept(person);
            }
        }
    }
}
