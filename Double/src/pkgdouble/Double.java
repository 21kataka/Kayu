/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgdouble;
import java.util.Scanner;
/**
 *
 * @author Education Unlmited
 */
public class Double {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double dice1 = 0;
        double dice2 = 1;
        
        while (dice1 != dice2) {
        System.out.print("This is a dice program, just say yes for the dices to roll.");
        String input = keyboard.nextLine();
        
        if (input.equals("yes"));
              dice1 = (int)(Math.random()*6+1);
              dice2 = (int)(Math.random()*6+1);
              
             
               if (dice1 == dice2){
                System.out.println("Congratulations! You got " + dice1 + " and " + dice2 + "");
               }
               else {
                   System.out.println("Try again! You got " + dice1 + " and " + dice2 + "");
               }
           }
            
    }
    
}
