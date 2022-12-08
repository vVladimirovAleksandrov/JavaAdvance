package JavaAdvance.JavaOOP.WorkingWithAdstraction.Exercise.JediGalaxy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = readPositions(scanner);
        int rows = dimensions[0];
        int cols = dimensions[1];

        Field field = new Field(rows, cols);

        long starsCollected = 0;
        String command = scanner.nextLine();
        while (!command.equals("Let the Force be with you")) {
            Jedi jedi = new Jedi(Arrays.stream(command.split(" ")).mapToInt(Integer::parseInt).toArray());
            EvilPower evil = new EvilPower(readPositions(scanner));

            Galaxy galaxy = new Galaxy(field, jedi, evil);
            galaxy.moveEvil();

            starsCollected = galaxy.moveJedi();

            command = scanner.nextLine();
        }
        System.out.println("\n" + starsCollected);
    }

    private static int[] readPositions(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
    }
}
