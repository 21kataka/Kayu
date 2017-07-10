/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conditional;
    import java.util.Scanner;

/**
 *
 * @author Education Unlmited
 */
public class Conditional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
       
        int rightAnswers = 0;
        
        System.out.println("Here comes a quiz. No cheating!");
        
        System.out.println("Question 1: What is the capital of California?");
        System.out.println("\tA) San Francisco");
        System.out.println("\tB) Sacramento");
        System.out.println("\tC) Los Angeles");
        System.out.println("\tD) San Jose");
        String answer1 = keyboard.nextLine();
        if (answer1.equals("B")) {
            System.out.println("That is correct!");
            rightAnswers++;
        }
        else {
            System.out.println("Sorry, the captital is actually Sacramento!");
        }
        System.out.println("Question 2: Which university is number one right now in the world?");
        System.out.println("\tA) MIT");
        System.out.println("\tB) Stanford");
        System.out.println("\tC) Caltech");
        System.out.println("\tD) Harvard");
        String answer2 = keyboard.nextLine();
        if (answer2.equals("A")) {
            System.out.println("That is correct!");
            rightAnswers++;
        }
        else {
            System.out.println("Sorry, the top number one university in the world right now is MIT!");
        }
            System.out.println("Question 3: When doing Java what code is used inorder to print a message?");
        System.out.println("\tA) System.out.printin");
        System.out.println("\tB) System.out.printlm");
        System.out.println("\tC) System.out.printLn");
        System.out.println("\tD) System.out.println");
        String answer3 = keyboard.nextLine();
        if (answer3.equals("D")) {
            System.out.println("That is correct!");
            rightAnswers++;
        }
        else {
            System.out.println("Sorry, the correct answer was D!");
        }
        System.out.println("Question 4: If I'm going 80 miles per hour how long will it take go to 80 miles");
        System.out.println("\tA) A minute");
        System.out.println("\tB) A second");
        System.out.println("\tC) A hour");
        System.out.println("\tD) 80 miles");
        String answer4 = keyboard.nextLine();
        if (answer4.equals("C")) {
            System.out.println("That is correct!");
            rightAnswers++;
        }
        else {
            System.out.println("Sorry, the correct answer was C!");
        }
        System.out.println("Question 5: Who is the prime minister of Canada");
        System.out.println("\tA) Justin Trudeau");
        System.out.println("\tB) Stephen Harper");
        System.out.println("\tC) Thomas Mulcair");
        System.out.println("\tD) Gilles Duceppe");
        String answer5 = keyboard.nextLine();
        if (answer5.equals("A")) {
            System.out.println("That is correct!");
            rightAnswers++;
        }
        else {
            System.out.println("Sorry, the prime minister of Canada is Justin Trudeau!");
        }
        System.out.println("Question 6: What is the science formula for water");
        System.out.println("\tA) 1 hydrogen and 2 oxygen");
        System.out.println("\tB) 2 hydrogen and 1 oxygen");
        System.out.println("\tC) 1 hydrogen and 1 oxygen");
        System.out.println("\tD) 2 hydrogen and 2 oxygen");
        String answer6 = keyboard.nextLine();
        if (answer6.equals("B")) {
            System.out.println("That is correct!");
            rightAnswers++;
        }
        else {
            System.out.println("Sorry, the correct answer was B!");
        }
        System.out.println("Your score is " + rightAnswers + " out of 6 question.");
    }
    
}
