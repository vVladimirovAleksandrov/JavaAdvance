package JavaAdvance.JavaAdvanced.SetsAndMapsAdvanced.Lab;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class CitiesByContinentAndCountry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Map<String, List<String>>> towns = new LinkedHashMap<>();

        int count = Integer.parseInt(scanner.nextLine());
        while(count-- > 0){
            String[] input = scanner.nextLine().split(" ");
            String continent = input[0];
            String country = input[1];
            String city = input[2];

            if(!towns.containsKey(continent)){
                towns.put(continent, new LinkedHashMap<>(){
                    {put(country, new ArrayList<>() {
                        {add(city);}
                    });}
                });
            } else {
                if(!towns.get(continent).containsKey(country)){
                    towns.get(continent).put(country, new ArrayList<>(){{add(city);}});
                } else {
                    towns.get(continent).get(country).add(city);
                }
            }
        }

        for (String continent : towns.keySet()) {
            System.out.println(continent + ":");

            for (String country : towns.get(continent).keySet()) {
                System.out.printf(" %s -> %s\n", country, String.join(", ", towns.get(continent).get(country)));
            }
        }
    }
}
