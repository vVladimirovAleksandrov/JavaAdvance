package JavaAdvanced.SetsAndMapsAdvanced.Lab;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

class ParkingLot{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> parkingLot = new LinkedHashSet<>();
        while(true){
            String input = scanner.nextLine();
            if(input.equals("END")){
                break;
            } else {
                String[] reminder = input.split(", ");
                if(reminder[0].equals("IN")){
                    parkingLot.add(reminder[1]);
                } else {
                    parkingLot.remove(reminder[1]);
                }
            }
        }

        String output = parkingLot.isEmpty() 
                ? "Parking Lot is Empty"
                : String.join(System.lineSeparator(), parkingLot);
        System.out.println(output);
    }
}