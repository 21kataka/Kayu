/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgboolean;

/**
 *
 * @author Education Unlmited
 */
public class Boolean {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String g = "Goodmorning";
        String w = "Hi there!";
        String z = "Howdy, partner!";
        
        boolean h = g.equals(w);
        int o = g.compareTo(z);
        int q = g.compareTo(w);
        
        System.out.println(h);
        System.out.println(q);
        
        boolean b1 = true;
        boolean b2 = false;
        
        System.out.println("True and not true:" + (b1 && !b1));
        
        int x,y;
        boolean a,b,c,d,e,f;
        x=55;
        y=66;
        a= x==y;
        // equal to
        b= x!=y;
        // not equal to
        c= x>y;
        // greater than
        d= x<y;
        // less than
        e= x>=y;
        // greater than or equal to
        f= x<=y;
        // less than or equal to
        System.out.println(x + " is equal to " + y + ": " + a);
        System.out.println(x + " is not equal to " + y + ": " + b);
        System.out.println(x + " is greater than " + y + ": " + c);
        System.out.println(x + " is less than " + y + ": " + d);
        System.out.println(x + " is greater than or equal to " + y + ": " + e);
        System.out.println(x + " is less than or equal to " + y + ": " + f);
    
    }
    
}
