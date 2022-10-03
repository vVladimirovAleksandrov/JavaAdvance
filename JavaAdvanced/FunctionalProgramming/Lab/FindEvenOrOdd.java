package JavaAdvanced.FunctionalProgramming.Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FindEvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer :: parseInt).toArray();
        String format = scanner.nextLine();
        List<Integer> nums = filterdList(format, input[0], input[1]);
        for (Integer item : nums) {
            System.out.print(item + " ");
        }

    }

    static List<Integer> filterdList(String format, int start, int end){
        List<Integer> nums = assassinElements(start, end);

        switch(format){
            case "odd":
                nums.removeIf(e -> e % 2 == 0);
                break;

            case "even":
                nums.removeIf(e -> e % 2 != 0);
                break;

        }
        return nums;
    }

    static List<Integer> assassinElements(int start, int end){
        List<Integer> nums = new ArrayList<>();

        for (int i = start; i <= end; i++) {
            nums.add(i);
        }
        return nums;
    }
}
