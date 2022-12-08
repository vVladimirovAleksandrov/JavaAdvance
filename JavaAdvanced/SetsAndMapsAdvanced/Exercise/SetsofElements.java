package JavaAdvance.JavaAdvanced.SetsAndMapsAdvanced.Exercise;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SetsofElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<Integer> numsN = new LinkedHashSet<>();
        Set<Integer> numsM = new LinkedHashSet<>();

        String[] input = scanner.nextLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        while(n-- > 0){
            int num = Integer.parseInt(scanner.nextLine());
            numsN.add(num);
        }
        while(m-- > 0){
            int num = Integer.parseInt(scanner.nextLine());
            numsM.add(num);
        }

        for (Integer item : numsN) {
            if(numsM.contains(item)){
                System.out.print(item + " ");
            }
        }
    }
}
