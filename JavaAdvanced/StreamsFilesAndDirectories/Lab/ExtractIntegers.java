package JavaAdvanced.StreamsFilesAndDirectories.Lab;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class ExtractIntegers {
    public static void main(String[] args) throws FileNotFoundException {

        String inputPath = "/Users/viktoraleksandrov/Documents/04. Java-Advanced-Files-and-Streams-Lab-Resources/input.txt";
        String outputPath = "/Users/viktoraleksandrov/Documents/04. Java-Advanced-Files-and-Streams-Lab-Resources/extractInteger.txt";

        Scanner scanner = new Scanner(new FileInputStream(inputPath));
        PrintWriter out = new PrintWriter(new FileOutputStream(outputPath));

        while(scanner.hasNext()){
            if(scanner.hasNextInt()){
                out.println(scanner.nextInt());
            }
            scanner.next();
        }
        out.close();
    }
}
