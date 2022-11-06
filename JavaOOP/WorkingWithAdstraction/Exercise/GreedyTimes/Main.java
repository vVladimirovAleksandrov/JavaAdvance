package JavaOOP.WorkingWithAdstraction.Exercise.GreedyTimes;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long capacity = Long.parseLong(scanner.nextLine());
        String[] safe = scanner.nextLine().split("\\s+");

        Bag bag = new Bag();

        for (int i = 0; i < safe.length; i += 2) {
            String itemName = safe[i].toLowerCase();
            long amount = Long.parseLong(safe[i + 1]);

            Item item = createItem(itemName, amount);
            bag.put(item);

            //put item in the bag
        }
        System.out.println(bag.toString());
    }

    private static Item createItem(String itemName, long amount) {
        ItemType itemType;

        //create item
        if (itemName.length() == 3) {
            itemType = ItemType.CASH;
        } else if (itemName.toLowerCase().endsWith("gem")) {
            itemType = ItemType.GEM;
        } else if (itemName.equals("gold")) {
            itemType = ItemType.GOLD;
        } else {
            return null;
        }
        return new Item(itemType, itemName, amount);
    }
}