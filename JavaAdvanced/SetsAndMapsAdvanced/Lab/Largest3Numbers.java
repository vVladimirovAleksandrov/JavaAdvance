package JavaAdvanced.SetsAndMapsAdvanced.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Largest3Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> sorted = Arrays.stream(scanner.nextLine().split(" "))
            .map(Integer :: parseInt).sorted((n1, n2) -> n2.compareTo(n1))
            .collect(Collectors.toList());
        
        if(sorted.size() < 3){
            for (Integer item : sorted) {
                System.out.print(item + " ");
            }
        } else {
            for (int i = 0; i < 3; i++) {
                System.out.print(sorted.get(i) + " ");
            }
        }
    }
}