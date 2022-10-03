package JavaAdvanced.StreamsFilesAndDirectories.Exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class SumLines {
    public static void main(String[] args) {
        String inputPath = "/Users/viktoraleksandrov/Documents/VSCode/SoftUni_Java/JavaAdvanced/StreamsFilesAndDirectories/Exercise/resources";

        try(BufferedReader reader = Files.newBufferedReader(Paths.get(inputPath))) {
            String line = reader.readLine();

            while(line != null) {
                long sum = 0;
                for (char c : line.toCharArray()) {
                    sum += c;
                }

                System.out.println(sum);
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
