/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forloopsfun;

import java.util.Scanner;

/**
 *
 * @author Education Unlmited
 */
public class Forloopsfun {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int input = 10;
        int startingnumber = 0;
        int endingnumber = 0;
        int countingnumber = 0;
        for (int cn = 0; cn < 10; cn++) {
            System.out.println("I LOVE JAVA!");

        }
        System.out.println();
        System.out.println("What do you want to count to?");
        input = keyboard.nextInt();
        for (int cn = 0; cn < input; cn++) {
            System.out.println("I LOVE JAVA!");
        }
        System.out.println();
        System.out.println("what is your starting number?");
        startingnumber = keyboard.nextInt();
        System.out.println("what is your ending number?");
        endingnumber = keyboard.nextInt();
        System.out.println("what is your counting number?");
        countingnumber = keyboard.nextInt();
        for ( int i = startingnumber; i < endingnumber; i = i + countingnumber ) {
            System.out.println("" + i );
        }
        System.out.println();
        int[] Array = new int[10];
       
        for ( int i = 0; i < 10;i++) {
            Array[i] = i;
            System.out.println(" " + Array[i]);
        }
        System.out.println("Second Array");
        int[] Array2 = new int[10];
       
        for ( int i = 0; i < 10;i++) {
            Array2[i] = Array[i]+2;
            System.out.println(" " + Array2[i]);
        }
        System.out.println();
        int[] Array3 = new int[100];
        int x = 5;
        int y = 0;
        for ( int i = 0; i < 100;i++) {
            Array3[i] = i;
            System.out.print(" " + Array3[i]);
            y = i % x;
            if (y == 0) {
                System.out.print("!");
            }    
        }
        
    }
}