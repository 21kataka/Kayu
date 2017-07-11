/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayfun;

/**
 *
 * @author Education Unlmited
 */
public class Arrayfun {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] Array = new int[10];
        Array[0] = 1;
        Array[1] = 3;
        Array[2] = 5;
        Array[3] = 7;
        Array[4] = 9;
        Array[5] = 11;
        Array[6] = 13;
        Array[7] = 15;
        Array[8] = 17;
        Array[9] = 19;
        System.out.println(" First number in the Array is " + Array[0] + "");
        System.out.println(" Second number in the Array is " + Array[1] + "");
        System.out.println(" Third number in the Array is " + Array[2] + "");
        System.out.println(" Fourth number in the Array is " + Array[3] + "");
        System.out.println(" Fifth number in the Array is " + Array[4] + "");
        System.out.println(" Sixth number in the Array is " + Array[5] + "");
        System.out.println(" Seventh number in the Array is " + Array[6] + "");
        System.out.println(" Eight number in the Array is " + Array[7] + "");
        System.out.println(" Ninth number in the Array is " + Array[8] + "");
        System.out.println(" Tenth number in the Array is " + Array[9] + "");

        double[] array2 = new double[10];
        int index = 0;
        while (index < 10) {
            array2[index] = index;
            System.out.println("The number at index " + index + " is " + array2[index] + ", ");
            index++;
        }
        int cn = 0;
        int size = 1000;
        int random;
        int[] array3 = new int[size];
        while (cn < 1000){
            random = (int) (Math.random() * 1000) + 1;
            array3[cn]=random;
            System.out.println("The number at index " + cn + " is " + array3[cn]);
            cn ++;
        }
        
        
        
    }
}
