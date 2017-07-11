/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package highorlow;

import java.util.Scanner;

/**
 *
 * @author Education Unlmited
 */
public class Highorlow {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int cn = 0;
        double random;

        System.out.println("Hi there fella, guess my number from 1 to 100 hehehe.");
        random = (int) (Math.random() * 100 + 1);
        double input = keyboard.nextDouble();

        while (random != input) {
            if (input < random) {
                System.out.println("Your guessed number was too low!");
            } else {
                System.out.println("Your guessed number was too high!");
            }
            System.out.println("Guess again!");
            input = keyboard.nextDouble();
            cn++;
        }
        System.out.println("Congratulations you got it on your " + cn + " try.");

    }

}
