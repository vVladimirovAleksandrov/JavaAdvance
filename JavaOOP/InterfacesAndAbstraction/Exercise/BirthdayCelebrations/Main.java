package JavaAdvance.JavaOOP.InterfacesAndAbstraction.Exercise.BirthdayCelebrations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Birthable> thinksWithBirthday = new ArrayList<>();

        String command = scanner.nextLine();
        while (!command.equals("End")) {
            String[] input = command.split("\\s+");

            switch (input[0]) {
                case "Citizen":
                    Citizen citizen = new Citizen(input[1], Integer.parseInt(input[2]), input[3], input[4]);
                    thinksWithBirthday.add(citizen);
                    break;
                case "Pet":
                    Pet pet = new Pet(input[1], input[2]);
                    thinksWithBirthday.add(pet);
                    break;
                case "Robot":
                    break;
            }
            command = scanner.nextLine();
        }

        String year = scanner.nextLine();

        boolean isFound = false;
        for (Birthable item : thinksWithBirthday) {
            if(item.getBirthDate().endsWith(year)) {
                System.out.println(item.getBirthDate());
                isFound = true;
            }
        }

        if(!isFound) {
            System.out.println("<no output>");
        }
    }
}
