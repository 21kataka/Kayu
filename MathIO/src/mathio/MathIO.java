/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathio;
import java.io.*;

/**
 *
 * @author Education Unlmited
 */
public class MathIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String FILENAME = "numbers.txt";

        //Part 1
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILENAME))) {
            //here is where you should put your numbers
            String line1 = "";
            String line2 = "12345\n";
            String line3 = "678910\n";
            String line4 = "1112131415\n";
            String line5 = "1617181920\n";
            String line6 = "2122232425\n";

            //here is where you should write your numbers to the file
            writer.write(line1);
            writer.write(line2);
            writer.write(line3);
            writer.write(line4);
            writer.write(line5);
            writer.write(line6);
            
            System.out.println("Done");

        } catch (IOException e) {
            e.printStackTrace();

        }

        //Part 2
        try (BufferedReader reader = new BufferedReader(new FileReader(FILENAME))) {
            int sum = 0;
            String currentLine = reader.readLine();
            while (currentLine != null) {
                sum += Double.parseDouble(currentLine);
                System.out.println(sum);
                System.out.println(currentLine);
                currentLine = reader.readLine();
            }

        }
        catch (IOException e) {
            e.printStackTrace();
	}
    }
}
