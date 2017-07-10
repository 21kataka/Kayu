/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathoperation;

/**
 *
 * @author Education Unlmited
 */
public class Mathoperation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
         int p,q,r,s,t,u;
         double l,k,f,w,h,d;
          double a,b,c;
          String first, second, together;
          
          l = 263;
          k = 657;
          f = l + k;
          System.out.println( "l is " + l + ", k is " + k );
          System.out.println( "l+k is " + f );
          
          w = l - k;
          h = l * k;
          d = 1 / k;
          
           System.out.println( "l-k is " + w );
           System.out.println( "l*k is " + h );
           System.out.println( "l/k is " + d );
          
          p = 8;
          q = 25;
         System.out.println( "p is " + p + ", q is " + q );
 
         r = p + q;
         System.out.println( "p+q is " + r );
         s = p - q;
         System.out.println( "p-q is " + s );
         t = p+q*3;
         System.out.println( "p+q*3 is " + t );
         u = q / 2;
         System.out.println( "q/2 is " + u );
        
        a = 1.1;
         System.out.println( "a is " + a );
         b = a*a;
         System.out.println( "a*a is " + b );
         c = b / 2;
         System.out.println( "b/2 is " + c );
         System.out.println();

         first = "peanut butter";
         second = " and jelly";
         together = first + second;
         System.out.println( together );
    }
    
}
