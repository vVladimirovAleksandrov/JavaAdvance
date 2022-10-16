package JavaAdvanced.Workshop.SmartArray;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        SmartArray smartArray = new SmartArray();

        smartArray.add(12);
        smartArray.add(32);
        smartArray.add(1, 56);

        int element = smartArray.remove(0);
        System.out.println(element);

        System.out.println(smartArray.get(2));
        System.out.println(smartArray.contains(34));
        smartArray.forEach(e -> System.out.println(e));
    }
}
