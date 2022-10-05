package JavaAdvanced.DefiningClasses.Exercise.PokemonTrainer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tournament tournament = new Tournament(scanner);
        tournament.registerParticipants();
        tournament.playAllRounds();
        tournament.printResults();
    }
}