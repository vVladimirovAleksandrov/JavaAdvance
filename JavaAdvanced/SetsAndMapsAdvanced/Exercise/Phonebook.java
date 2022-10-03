package JavaAdvanced.SetsAndMapsAdvanced.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> phoneNumbers = new LinkedHashMap<>();

        while(true){
            String input = scanner.nextLine();
            if(input.equals("search")){
                break;
            }

            String[] info = input.split("-");
            String name = info[0];
            String phone = info[1];

            phoneNumbers.putIfAbsent(name, null);
            phoneNumbers.put(name, phone);
        }

        while(true){
            String input = scanner.nextLine();
            if(input.equals("stop")) break;

            if(phoneNumbers.containsKey(input)){
                System.out.printf("%s -> %s\n", input, phoneNumbers.get(input));
            } else {
                System.out.printf("Contact %s does not exist.\n", input);
            }
        }
    }
}
