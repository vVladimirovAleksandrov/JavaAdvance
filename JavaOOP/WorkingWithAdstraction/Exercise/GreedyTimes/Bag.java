package JavaAdvance.JavaOOP.WorkingWithAdstraction.Exercise.GreedyTimes;

import java.util.List;

public class Bag {
    private List<Item> items;
    private int capacity;
    //put

    @Override
    public String toString() {


//        for (var x : bag.entrySet()) {
//            Long sumValues = x.getValue().values().stream().mapToLong(l -> l).sum();
//
//            System.out.println(String.format("<%s> $%s", x.getKey(), sumValues));
//
//            x.getValue().entrySet().stream().sorted((e1, e2) -> e2.getKey()
//                    .compareTo(e1.getKey())).forEach(i -> System.out.println("##" + i.getKey() + " - " + i.getValue()));
//
//        }
        return null;
    }

    public void put(Item item){
        if (weCanStore(item)){
            //check if we should update value, or create a new one


//            if (!bag.containsKey(itemType)) {
//                bag.put((itemType), new LinkedHashMap<String, Long>());
//            }
//
//            if (!bag.get(itemType).containsKey(itemName)) {
//                bag.get(itemType).put(itemName, 0L);
//            }
//            bag.get(itemType).put(itemName, bag.get(itemType).get(itemName) + amount);

            items.add(item);
        }
    }

    private boolean weCanStore(Item item) {
        if (capacity < getTotalAmount() + item.getAmount()) {
            return false;
        }

        switch (item.getItemType()) {
            case GEM:
                if (getAmount(ItemType.GEM) + item.getAmount() > getAmount(ItemType.GOLD)) {
                    return false;
                }
                break;
            case CASH:
                if (getAmount(ItemType.CASH) + item.getAmount() > getAmount(ItemType.GEM)) {
                    return false;
                }
                break;
        }
        return true;
    }

    public long getTotalAmount() {
        return getAmount(ItemType.GEM) + getAmount(ItemType.GOLD) + getAmount(ItemType.CASH);
    }

    public long getAmount(ItemType itemType) {
        return this.items.stream()
                .filter(e -> e.getItemType().equals(itemType))
                .mapToLong(Item::getAmount)
                .sum();
    }
}
