/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functions;

/**
 *
 * @author Education Unlmited
 */
public class Functions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //this part will test the functions
        System.out.println(" (0,-3) to (-1,-7) has slope " + slope(0, -3, -1, -7));
        System.out.println(" (2,8) to (4,-4) has slope " + slope(2, 8, 4, -4));

        System.out.println(" (0,-3) to (-1,-7) has distance " + distance(0, -3, -1, -7));
        System.out.println(" (2,8) to (4,-4) has distance " + distance(2, 8, 4, -4));
        
        System.out.println(" (5,-9) to (-6,-2) has line " + line(5, -9, -6, -2));
        System.out.println(" (8,3) to (1,-9) has line " + line(8, 3, 1, -9));

    }

    public static double slope(int x1, int y1, int x2, int y2) {
        double slope;
        slope = (y2 - y1)/(x2-x1);
        return slope;
    }

    public static double distance(int x1, int y1, int x2, int y2) {
        double distance;
        distance = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        return distance;
    }
    
    public static double line(int x1, int y1, int x2, int y2) {
        double m;
          m = (y2 - y1)/(x2-x1);
        double x;
        double b;
        double y;
          y = mx + b;
    }
}
