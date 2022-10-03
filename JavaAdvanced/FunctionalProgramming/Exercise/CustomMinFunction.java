package JavaAdvanced.FunctionalProgramming.Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

public class CustomMinFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Function<int[], Integer> smalest = arr -> {
            int small = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if(small > arr[i]){
                    small = arr[i];
                }
            }
            return small;
        };

        int[] nums = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer :: valueOf).toArray();
        System.out.println(smalest.apply(nums));
    }
}
