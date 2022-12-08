package JavaAdvance.JavaAdvanced.Workshop.CustomStack;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CustomStack stack = new CustomStack();

        stack.push(12);
        stack.peek();
    }
}
