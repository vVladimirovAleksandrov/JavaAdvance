package JavaAdvance.JavaAdvanced.DefiningClasses.Lab.CarInfo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Car> cars = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());
        while(n-- > 0){
            String[] input = scanner.nextLine().split("\\s+");

            Car car;
            if(input.length == 1){
                car = new Car(input[0]);
            } else {
                car = new Car(input[0], input[1], Integer.valueOf(input[2]));
            }

            cars.add(car);
        }

        for (Car car : cars) {
            System.out.println(car.carInfo());
        }
    }
}
