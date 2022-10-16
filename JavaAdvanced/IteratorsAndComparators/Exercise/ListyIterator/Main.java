package JavaAdvanced.IteratorsAndComparators.Exercise.ListyIterator;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ListyIterator listyIterator = null;

        String input = scanner.nextLine();
        while(!input.equals("END")){
            String[] commandParts = input.split(" ");
            String commandName = commandParts[0];

            switch(commandName){
                case "Create":
                    String[] elementArray = Arrays.copyOfRange(commandParts, 1, commandParts.length);
                    listyIterator = new ListyIterator(elementArray);
                    break;

                case "Move":
                    break;

                case "HasNext":
                    break;
                
            }
        }
    }
}
