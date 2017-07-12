/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searchlist;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Education Unlmited
 */
public class Searchlist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        Scanner keyboard = new Scanner(System.in);

        int cn = 0;
        int size = 1000;
        int random;
        while (cn < 10) {
            random = (int) (Math.random() * 50) + 1;
            a.add(random);
            cn++;

        }
        System.out.println("Please input a number to search inside the Array list.");
        int answer = keyboard.nextInt();
        boolean found = false;
        for (int i = 0; i < a.size(); i++) {
            if ((int) a.get(i) == answer) {
                found = true;
                System.out.println("Found!");
            }

        }
        if (found == false) {
            System.out.println("Better luck next time");
        }
        int largestnumber = 0;
        for (int i = 0; i < a.size(); i++) {
            if ((int) a.get(i) > largestnumber) {
                largestnumber = (int) a.get(i);
            }
            int[] hi = new int[10];

        }
        System.out.println(a);
        System.out.println(largestnumber);

        ArrayList<String> b = new ArrayList();
        b.add("A");
        b.add(" bunch");
        b.add(" of");
        b.add(" revolutionary");
        b.add(" manumission");
        b.add(" abolitionists,");
        b.add(" give");
        b.add(" me");
        b.add(" your");
        b.add(" position");
        b.add(" show");
        b.add(" me");
        b.add(" where");
        b.add(" the");
        b.add(" ammunition");
        b.add(" is!");
        String first;
        ArrayList sorted = new ArrayList();
        while (b.size() > 0) {
            first = b.get(0);
            for (int i = 0; i < b.size(); i++) {
                if (first.compareTo(b.get(i)) > 0) {
                    first = b.get(i);

                }
            }

            b.remove(first);
            sorted.add(first);
        }
        System.out.print(sorted);
    }
    
}
