package JavaAdvance.JavaOOP.Inheritance.Exercise.PlayersAndMonsters.hero;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        SoulMaster soul = new SoulMaster(scanner.nextLine(), Integer.parseInt(scanner.nextLine()));
        System.out.println(soul);
    }
}