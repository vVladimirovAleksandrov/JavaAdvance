package JavaAdvance.JavaAdvanced.StreamsFilesAndDirectories.Lab;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyBytes {
    public static void main(String[] args) throws FileNotFoundException {
        
        String inputPath = "/Users/viktoraleksandrov/Documents/04. Java-Advanced-Files-and-Streams-Lab-Resources/input.txt";
        String outputPath = "/Users/viktoraleksandrov/Documents/04. Java-Advanced-Files-and-Streams-Lab-Resources/copyBytes.txt";

        try(InputStream in = new FileInputStream(inputPath);
            OutputStream out = new FileOutputStream(outputPath)) {
            
                int oneByte = 0;
                while((oneByte = in.read()) >= 0){
                    if(oneByte == 10 || oneByte == 32){
                        out.write(oneByte);
                    } else {
                        String digits = String.valueOf(oneByte);
                        for (int i = 0; i < digits.length(); i++) {
                            out.write(digits.charAt(i));
                        }
                    }
                }
        } catch (FileNotFoundException e) {
            throw new FileNotFoundException("File not found");
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
