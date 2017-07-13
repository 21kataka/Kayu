/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chooseyourownadventure;

import java.util.Scanner;

/**
 *
 * @author Education Unlmited
 */
public class Chooseyourownadventure {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Hey there fella lets play a fun little game. Imagine yourself in a cave with yourself in a cave with your buddy.");
        System.out.println("But suddenly the cave starts to rumble and the rocks from the top of the cave started to fall down.");
        System.out.println("The rocks fell down onto your buddy and he is not able to get up as he is stuck.");
        System.out.println("What do you do? 1. Help your friend by moving the rocks out. Or 2. Run out of the cave to get help.");
        int answer1 = keyboard.nextInt();
        if (answer1 == 2) {
            System.out.println("You are able to go outside of the cave, but realise that noone is around.");
            System.out.println();
            System.out.println("You remeber that you have your phone in your pocket. 1. You choose to use your phone to call for help. Or 2. You choose to run back into the cave and think of other ways to help your friend get out.");
            int answer3 = keyboard.nextInt();
            if (answer3 == 1) {
                System.out.println("You are able to succesfully call 911 for help as the emergency department are able to save your friend in time.");
            }
            if (answer3 == 2) {
                System.out.println("You try to go back to the cave.");
                System.out.println("But you realise by then its too late as your friend has passed out.");
            }
        }
        if (answer1 == 1) {
            System.out.println("You try to move the rocks to help your friend, but you realise that the rocks are too heavy.");
            System.out.println();
            System.out.println("You remeber that you have a rope in your bag and your phone in your pocket. 1. You choose to use the rope to help your friend get out. Or 2. You use your phone to call for help.");
            int answer2 = keyboard.nextInt();
            if (answer2 == 1) {
                System.out.println("You try to tie the rope onto your friend and pull him out of the rocks. But realise that the weight of the rocks on top of him is too heavy to get him out.");
                System.out.println("You realise by then its too late as your friend has passed out.");
            }
            if (answer2 == 2) {
                System.out.println("You try to call 911 for help. But realise that you cant call because there is simply no connection.");
                System.out.println("You realise by then its too late as your friend has passed out.");
            }
        }

    }

}
