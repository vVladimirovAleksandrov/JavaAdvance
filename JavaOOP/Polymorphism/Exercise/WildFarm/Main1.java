package JavaAdvance.JavaOOP.Polymorphism.Exercise.WildFarm;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        String command = scanner.nextLine();
        while (!command.equals("End")){
            String[] input = command.split("\s+");

            if(count % 2 == 0){
                String animalType = input[0];
            }

            command = scanner.nextLine();
            count++;
        }
    }
}
