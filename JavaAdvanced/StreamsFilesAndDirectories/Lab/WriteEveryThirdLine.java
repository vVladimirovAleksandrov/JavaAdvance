package JavaAdvanced.StreamsFilesAndDirectories.Lab;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class WriteEveryThirdLine {
    public static void main(String[] args) {

        String inputPath = "/Users/viktoraleksandrov/Documents/04. Java-Advanced-Files-and-Streams-Lab-Resources/input.txt";
        String outputPath = "/Users/viktoraleksandrov/Documents/04. Java-Advanced-Files-and-Streams-Lab-Resources/everyThurdLine.txt";
        
        try(BufferedReader in = new BufferedReader(new FileReader(inputPath));
                PrintWriter out = new PrintWriter(new FileWriter(outputPath))) {
            int counter = 1;
            String line = in.readLine();
            while(line != null){
                if(counter % 3 == 0){
                    out.println(line);
                }
                counter++;
                line = in.readLine();
            }
        } catch (Exception e) {
        }
    }
}
