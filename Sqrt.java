/**************************************************************************************************
*Write a Program Sqrt.java to compute the square root of a nonnegative number c
*given in the input using Newton's method:
*
* @author-Nikhilesh
* @version 1.7.0
* @since 15-08-2017
*
****************************************************************************************************/
public class Sqrt { 
    public static void main(String[] args) { 

        // read in the command-line argument
        double c = Double.parseDouble(args[0]);
        double epsilon = 1e-15;    
        double t = c;             

        // repeatedly apply Newton update step until desired accuracy reached.
        while (Math.abs(t - c/t) > epsilon*t) {
            t = (c/t + t) / 2.0;
        }

        // print the square root of c
        System.out.println(t);
    }

}

