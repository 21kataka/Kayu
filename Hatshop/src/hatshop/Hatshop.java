/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hatshop;

import java.util.Scanner;

/**
 *
 * @author Education Unlmited
 */
public class Hatshop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        boolean loop = true;
        int hats = 0;
        int color;
        int red = 0;
        int blue = 0;
        int black = 0;
        int white = 0;
        double money = 0;
        double money1 = 4.99;
        double money2 = 4.99;
        double money3 = 4.99;
        double money4 = 4.99;
        while (loop) {
            System.out.println("This is a hat shop, would you like to. \n 1. Add a hat to cart \n 2. See your cart \n 3. Remove hat from the order \n 4. Check out ");
            int options = keyboard.nextInt();
            if (options == 1) {
                hats++;
                System.out.println("What color would you like to choose from. \n 1. Blue \n 2. Red \n 3. Black \n 4. White");
                color = keyboard.nextInt();
                    if (color == 1){
                        blue ++;
                    }
                    if (color == 2){
                        red ++;
                    }
                    if (color == 3){
                        black ++;
                    }
                    if (color == 4){
                        white ++;
                    }
                System.out.println("You have added in your cart \n " + blue + " blue hat \n " + red + " red hat \n " + black + " black hat \n " + white + " white hat");
                System.out.println();
            }
            if (options == 2) {
                System.out.println("In your cart you have \n " + blue + " blue hat \n " + red + " red hat \n " + black + " black hat \n " + white + " white hat");
                System.out.println();
            }
            if (options == 3) {
                System.out.println("What hat color would you like to remove. \n 1. Blue \n 2. Red \n 3. Black \n 4. White");
                int remove = keyboard.nextInt();
                    if (remove == 1){
                        blue --;
                    }
                    if (remove == 2){
                        red --;
                    }
                    if (remove == 3){
                        black --;
                    }
                    if (remove == 4){
                        white --;
                    }
                System.out.println("You now have \n " + blue + " blue hat \n " + red + " red hat \n " + black + " black hat \n " + white + " white hat");
                System.out.println();
            }
            if (options == 4) {
                money1 = money1 * blue;
                money2 = money2 * black;
                money3 = money3 * white;
                money4 = money4 * red;
                money = money + money1 + money2 + money3 + money4;
                System.out.println("In total you have \n " + blue + " blue hat \n " + red + " red hat \n " + black + " black hat \n " + white + " white hat \n With a total of $" + money + "");
                System.out.println();
                loop = false;
            }
        }
    }

}
