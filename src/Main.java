import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        File fileSource = new File("source.txt");
        File fileDes = new File("destination.txt");
        FileReader fileReader = null;
        FileWriter fileWriter = null;

        try {
            fileReader = new FileReader(fileSource);
            BufferedReader reader = new BufferedReader(fileReader);
            fileWriter = new FileWriter(fileDes);
            String line = null;
            while ((line = reader.readLine()) != null) {
                fileWriter.write(line + "\n");
            }
            fileWriter.flush();

            fileReader.close();
            fileWriter.close();
            System.out.println("File is copied successful!");
        } catch (IOException e) {
            System.out.println("File source did not exist");
        }
    }
}
