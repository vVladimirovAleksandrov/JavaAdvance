package JavaAdvanced.SetsAndMapsAdvanced.Lab;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ProductShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, LinkedHashMap<String, Double>> productShop = new TreeMap<>();

        String input = scanner.nextLine();
        while(!input.equals("Revision")){
            String[] info = input.split(", ");
            String shop = info[0];
            String product = info[1];
            double price = Double.valueOf(info[2]);

            productShop.putIfAbsent(shop, new LinkedHashMap<>());
            productShop.get(shop).putIfAbsent(product, 0.0);
            productShop.get(shop).put(product, price);

            input = scanner.nextLine();
        }

        for (String shop : productShop.keySet()) {
            System.out.println(shop + "->");

            for (String product : productShop.get(shop).keySet()) {
                System.out.printf("Product: %s, Price: %.1f\n", product, productShop.get(shop).get(product));
            }
        }
    }
}
