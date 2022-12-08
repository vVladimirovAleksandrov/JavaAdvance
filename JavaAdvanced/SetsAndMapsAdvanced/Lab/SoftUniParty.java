package JavaAdvance.JavaAdvanced.SetsAndMapsAdvanced.Lab;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> vips = new TreeSet<>();
        Set<String> regular = new TreeSet<>();

        while(true){//people invaite list
            String input = scanner.nextLine();
            if(input.equals("PARTY")){
                break;
            } else {
                if(Character.isDigit(input.charAt(0))){
                    vips.add(input);
                } else {
                    regular.add(input);
                }
            }
        }

        while(true){//remoce people who come
            String guestId = scanner.nextLine();
            if(guestId.equals("END")){
                break;
            } else {
                if(Character.isDigit(guestId.charAt(0))){
                    vips.remove(guestId);
                } else {
                    regular.remove(guestId);
                }
            }
        }

        System.out.println(vips.size() + regular.size());
        for (String person : vips) {
            System.out.println(person);
        }
        for (String person : regular) {
            System.out.println(person);
        }
    }
}
