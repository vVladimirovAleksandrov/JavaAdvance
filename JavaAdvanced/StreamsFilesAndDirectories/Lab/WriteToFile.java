package JavaAdvanced.StreamsFilesAndDirectories.Lab;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WriteToFile {
    public static void main(String[] args) throws FileNotFoundException {
        
        String inputPath = "/Users/viktoraleksandrov/Documents/04. Java-Advanced-Files-and-Streams-Lab-Resources/input.txt";
        String outputPath = "/Users/viktoraleksandrov/Documents/04. Java-Advanced-Files-and-Streams-Lab-Resources/output.txt";

        List<Character> symbols = new ArrayList<>();
        Collections.addAll(symbols, '.', ',', '!', '?');

        try(InputStream in = new FileInputStream(inputPath);
            OutputStream out = new FileOutputStream(outputPath)) {
            
                int oneByte = 0;
                while((oneByte = in.read()) >= 0){
                    if(!symbols.contains((char)oneByte)){
                        out.write(oneByte);
                    }
                }
        } catch (FileNotFoundException e) {
            throw new FileNotFoundException("File not found");
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
