package JavaAdvance.JavaOOP.Encapsulation.Exercise.ClassBox;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double lenght = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());

        Box box = new Box(lenght, width, height);
        System.out.println(String.format("Surface Area - %.2f", box.calculateSurfaceArea()));
        System.out.println(String.format("Lateral Surface Area - %.2f", box.calculateLateralSurfaceArea()));
        System.out.println(String.format("Volume - %.2f", box.calculateVolume()));
    }
}
