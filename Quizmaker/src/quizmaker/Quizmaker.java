/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizmaker;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Education Unlmited
 */
public class Quizmaker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("This is a quiz to test your knowledge. Let's begin.");
        try (BufferedReader reader = new BufferedReader(new FileReader("Questions.txt"))) {
            int questions=0;
            int cn = 0;
            String question = "", a1 = "", a2 = "", a3 = "", a4 = "", answer = "";
            String currentLine = reader.readLine();
            while (currentLine != null) {
                if (currentLine.equals("Questions")) {
                    question = reader.readLine();
                    currentLine = reader.readLine();
                } else if (currentLine.equals("AnswerChoice")) {
                    a1 = reader.readLine();
                    a2 = reader.readLine();
                    a3 = reader.readLine();
                    a4 = reader.readLine();
                    currentLine = reader.readLine();
                } else if (currentLine.equals("Answer")) {
                    answer = reader.readLine();
                    currentLine = reader.readLine();
                } else {
                    currentLine = reader.readLine();
                    System.out.println(question);
                    System.out.println(a1);
                    System.out.println(a2);
                    System.out.println(a3);
                    System.out.println(a4);
                    String answer1 = keyboard.nextLine();
                    questions++;
                    if (answer1.equals(answer)) {
                        cn++;
                        System.out.println("Correct!");
                    }
                    else {
                        System.out.println("Wrong answer");
                    }
                    System.out.println();
                }

            }
            System.out.println("You got " + cn + " out of " + questions +" right.");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
