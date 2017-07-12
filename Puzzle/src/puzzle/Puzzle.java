/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puzzle;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/**
 *
 * @author Education Unlmited
 */
public class Puzzle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int linenumber=0;
        String FILENAME = "puzzle.txt";
	try (BufferedReader reader = new BufferedReader(new FileReader(FILENAME))) {

            String currentLine = reader.readLine();

            while (currentLine != null) {
		if (linenumber % 3 == 0){
                  System.out.println(currentLine);
                }
                currentLine = reader.readLine();
                linenumber++;
            }
        }
        catch (IOException e) {
            e.printStackTrace();
	}
    }
    
}