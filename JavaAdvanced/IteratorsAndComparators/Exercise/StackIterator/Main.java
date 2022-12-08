package JavaAdvance.JavaAdvanced.IteratorsAndComparators.Exercise.StackIterator;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Stack stack = null;

        String input = scanner.nextLine();
        while(!input.equals("END")) {
            String[] commandParts = input.split(" ");//ne se splitvat pravilno
            String commandLine = commandParts[0];
            String[] elements = commandParts[1].split(",");
            //nameri kak da razdelish pravilno stringovete

            switch(commandLine){
                case "Push":
                    Integer[] elementsArr = stringToIntegers(Arrays.copyOfRange(elements, 0, elements.length));
                    if(stack == null){
                        stack = new Stack(elementsArr);
                    }
                    for (Integer integer : elementsArr) {
                        stack.push(integer);
                    }
                    break;
                
                case "Pop":
                    try {
                        stack.pop();
                    } catch (NoSuchElementException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
            }
            input = scanner.nextLine();
        }

        if(stack.getSize() != 0) {
            stack.printAll();
            stack.printAll();
        }
    }

    static Integer[] stringToIntegers(String[] arr){
        Integer[] result = new Integer[arr.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = Integer.parseInt(arr[i]);
        }
        return result;
    }
}
