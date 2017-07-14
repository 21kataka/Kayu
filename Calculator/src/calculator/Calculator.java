/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.ArrayList;
import java.util.List;
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
        System.out.println("This is 1.0 Calculator (press q to quit).");
        boolean on = true;
        while (on) {
            String input = keyboard.nextLine();
            ArrayList<Character> inputs = new ArrayList();
            for (char c : input.toCharArray()) {
                inputs.add(c);
            }
            if (inputs.contains('+')) {
                int p = inputs.indexOf('+');
                List<Character> ninthNum =  inputs.subList(0, p);
                List<Character> tenthNum = inputs.subList(p + 1, inputs.size());
                String num9 = charToString(ninthNum);
                String num10 = charToString(tenthNum);
                double a = Double.parseDouble(num9);
                double b = Double.parseDouble(num10);
                System.out.println(a + b);

            }
            if (inputs.contains('-')) {
                int o = inputs.indexOf('-');
                List<Character> seventhNum =  inputs.subList(0, o);
                List<Character> eigthNum = inputs.subList(o + 1, inputs.size());
                String num7 = charToString(seventhNum);
                String num8 = charToString(eigthNum);
                double c = Double.parseDouble(num7);
                double d = Double.parseDouble(num8);
                System.out.println(c - d);

            }
            if (inputs.contains('*')) {
                int k = inputs.indexOf('*');
                List<Character> firstNum =  inputs.subList(0, k);
                List<Character> secondNum = inputs.subList(k + 1, inputs.size());
                String num1 = charToString(firstNum);
                String num2 = charToString(secondNum);
                double e = Double.parseDouble(num1);
                double f = Double.parseDouble(num2);
                System.out.println(e * f);
            }
            if (inputs.contains('/')) {
                int l = inputs.indexOf('/');
                List<Character> thirdNum =  inputs.subList(0, l);
                List<Character> fourthNum = inputs.subList(l + 1, inputs.size());
                String num3 = charToString(thirdNum);
                String num4 = charToString(fourthNum);
                double g = Double.parseDouble(num3);
                double h = Double.parseDouble(num4);
                System.out.println(g / h);

            }
            if (inputs.contains('^')) {
                int m = inputs.indexOf('^');
                List<Character> fifthNum =  inputs.subList(0, m);
                List<Character> sixthNum = inputs.subList(m + 1, inputs.size());
                String num5 = charToString(fifthNum);
                String num6 = charToString(sixthNum);
                double i = Double.parseDouble(num5);
                double j = Double.parseDouble(num6);
                System.out.println(Math.pow(i, j));

            }

            if (inputs.contains('q')) {
                on = false;
            }
        }
    }

    public static String charToString(List<Character> chars) {
        StringBuilder result = new StringBuilder(chars.size());
        for (Character c : chars) {
            result.append(c);
        }
        String output = result.toString();
        return output;
    }

}
