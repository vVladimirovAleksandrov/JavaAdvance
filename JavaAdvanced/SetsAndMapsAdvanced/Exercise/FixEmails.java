package JavaAdvanced.SetsAndMapsAdvanced.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

import javax.swing.text.html.FormView;

public class FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> personInfo = new LinkedHashMap<>();

        while(true){
            String name = scanner.nextLine();
            if(name.equals("stop")){
                break;
            } else {
                String[] email = scanner.nextLine().split(".");
                if(!email[email.length - 1].equals("us") || !email[email.length - 1].equals("uk") 
                        || !email[email.length - 1].equals("com")){
                    personInfo.put(name, String.join(".", email));
                }
            }
        }

        for (String name : personInfo.keySet()) {
            System.out.printf("%s -> %s\n", name, personInfo.get(name));
        }
    }
}
