import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Search {

    public static void main(String[] args) {
        // check for right input length
        if (args.length != 2) {
            System.out.println("wrong input length");
            return;
        }

        String wordToBeSearchedFor = args[0];
        String filename = args[1];
        String lines = "";

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            int lineNumber = 1;

            while ((line = reader.readLine()) != null) {
                if (line.contains(wordToBeSearchedFor)) {    
                    lines = lines + lineNumber + " ";
                    System.out.println(lineNumber + ": " + line);
                }
                
                lineNumber++;
            }
            //System.out.print("The following lines contain the word: " + lines);

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}