/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userdata;

/**
 *
 * @author Education Unlmited
 */
import java.util.Scanner;
public class Userdata {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("What is your name?");
            String name  = keyboard.nextLine();
            System.out.println("How old are you?");
            int age = Integer.parseInt(keyboard.nextLine());
            System.out.println("What month is your birthday?");
            String month = keyboard.nextLine();
            System.out.println("What day is your birthday?");
            int day = Integer.parseInt(keyboard.nextLine());
            System.out.println("What year is your birthday?");
            int year = Integer.parseInt(keyboard.nextLine());
            System.out.println("What is your favorite book?");
            String book = keyboard.nextLine();
            System.out.println("Where are you from?");
            String birthplace = keyboard.nextLine();
            System.out.println("What is your lucky number?");
            int luckynumber = Integer.parseInt(keyboard.nextLine());
            System.out.println("What is your shoes size?");
            double size = Double.parseDouble(keyboard.nextLine());
            System.out.println("On a scale of 1 to 100, how excited are you to learn java?");
            int Java = Integer.parseInt(keyboard.nextLine());
            System.out.println("What is one cool fact about you?");
            String fact = keyboard.nextLine();
            
            System.out.println("" + name + " is " + age + " years old, born on " + month + "" + day + "," + year + ". Favorite book is " + book + " and is from "
                    +  birthplace + ". " + name + " lucky number is " + luckynumber + " and has a shoes size of " + size + ". " + name + " is on a scale " + 
                    Java + " to learn java, amd one cool fact about " + name + " is " + fact + ". ");
        }

    }
