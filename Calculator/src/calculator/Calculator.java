/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Education Unlmited
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("This is 1.0 Calculator.");
        boolean on=true;
        while(on) {
            String input = keyboard.nextLine();
            ArrayList<Character> inputs = new ArrayList();
            for (char c : input.toCharArray()) {
                inputs.add(c);
            }
            if (inputs.contains('+')){
                double a = Character.getNumericValue(inputs.get(0));
                double b = Character.getNumericValue(inputs.get(2));
                System.out.println(a+b);

            }
            if (inputs.contains('-')){
                int c = Character.getNumericValue(inputs.get(0));
                int d = Character.getNumericValue(inputs.get(2));
                System.out.println(c-d);

            }
            if (inputs.contains('*')){
                int e = Character.getNumericValue(inputs.get(0));
                int f = Character.getNumericValue(inputs.get(2));
                System.out.println(e*f);

            }
             if (inputs.contains('/')){
                int g = Character.getNumericValue(inputs.get(0));
                int h = Character.getNumericValue(inputs.get(2));
                System.out.println(g/h);

            }
             if (inputs.contains('^')){
                int i = Character.getNumericValue(inputs.get(0));
                int j = Character.getNumericValue(inputs.get(2));
                System.out.println(Math.pow(i,j));

            }

            if (inputs.contains('q')) {
                on=false;
            }
        }
    }

}
