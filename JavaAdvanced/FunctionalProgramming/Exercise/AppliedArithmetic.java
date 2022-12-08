package JavaAdvance.JavaAdvanced.FunctionalProgramming.Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AppliedArithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Function<List<Integer>, List<Integer>> add = list -> {
            List<Integer> addList = new ArrayList<>();
            list.forEach(item -> addList.add(item + 1));
            return addList;
        };

        Function<List<Integer>, List<Integer>> multiply = list -> {
            List<Integer> addList = new ArrayList<>();
            list.forEach(item -> addList.add(item * 2));
            return addList;
        };

        Function<List<Integer>, List<Integer>> subtract = list -> {
            List<Integer> addList = new ArrayList<>();
            list.forEach(item -> addList.add(item - 1));
            return addList;
        };

        Consumer<List<Integer>> printList = list -> list.forEach(item -> System.out.print(item + " "));


        List<Integer> nums = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        while(true){

            String input = scanner.nextLine();
            if(input.equals("end")) break;

            switch(input){
                case "add": nums = add.apply(nums);
                    break;
                case "multiply": nums = multiply.apply(nums);
                    break;
                case "subtract": nums = subtract.apply(nums);
                    break;
                case "print": 
                    printList.accept(nums);
                    System.out.println();
                    break;
            }
        }
    }
}
