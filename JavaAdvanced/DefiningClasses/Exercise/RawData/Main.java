package JavaAdvance.JavaAdvanced.DefiningClasses.Exercise.RawData;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Car> cars = new ArrayList<>();
        int linesCount = Integer.parseInt(scanner.nextLine());
        while(linesCount-- > 0){
            Car car = new Car(scanner.nextLine().split("\\s+"));
            cars.add(car);
        }

        switch (scanner.nextLine()) {
            case "fragile":
                cars.stream()
                        .filter(c -> c.getCargo().getType().equals("fragile")
                                     && Arrays.stream(c.getTires()).anyMatch(t -> t.getPressure() < 1))
                        .forEach(System.out::println);
                break;
            case "flamable":
                cars.stream()
                        .filter(c -> c.getCargo().getType().equals("flamable")
                                     && c.getEngine().getPower() > 250)
                        .forEach(System.out::println);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + scanner.nextLine());
        }
    }
}
