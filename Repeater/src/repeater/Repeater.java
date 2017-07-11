/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repeater;
import java.util.Scanner;
 
public class Repeater {

    public static void main(String[] args) {
    
       Scanner keyboard = new Scanner(System.in);
       System.out.print( "Type something, and I will repeat" );
       String input = keyboard.nextLine();
       System.out.print( "How many times do you want me to repeat it" );
       int repeat = Integer.parseInt(keyboard.nextLine());
       System.out.println("Here we go!");
       int count=0;
       while (count < repeat) {
           System.out.println(input);
           count ++;
       }

    }
    
}
