
/**
 * Write a description of class MonteCarlo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
import java.io.*;
import java.text.*;
public class MonteCarlo
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class MonteCarlo
     * @param h is half the length of the square
     * @param k is half the height of the square
     * @param r is the radius of the circle
     */
    public double h, k, r;
    public MonteCarlo(double h2, double k2, double r2)
    {
        // initialise instance variables
        h2 = h;
        k2 = k;
        r2 = r;
        if (k!=h)
        {System.out.println("I'm sorry, that's not a square.");}
    }

    /**
     * Method nextRainDrop_x() gives the x coordinate of a random raindrop within the square
     * @return     the x corrdinate of the raindrop 
     */
    public double nextRain_Drop_x()
    {
        // put your code here
        Random rndm = new Random();
        double x = 2*h*rndm.nextDouble();
        return x;
    }

    /**
     * Method nextRainDrop_y() gives the y coordinate of a random raindrop within the square
     * @return     the y corrdinate of the raindrop 
     */
    public double nextRain_Drop_y()
    {
        // put your code here
        Random rndm = new Random();
        double y = 2*k*rndm.nextDouble();
        return y;
    }
    
    /**
     * Method insideCircle(double x, double y) tells us whether or not the raindrop is within the circle
     * @param      double x and double y 
     * @return     boolean value true if inside or on the cirlce; boolean value false if outside the circle 
     */
    public boolean insideCircle(double x, double y)
    
    {
        // put your code here
        boolean b;
        if (Math.pow((x-h),2) + Math.pow((y-k),2) <= Math.pow(r,2))
        {
            b = true;
        }
        else
        {
            b = false;
        }
        return b;
    }
}
