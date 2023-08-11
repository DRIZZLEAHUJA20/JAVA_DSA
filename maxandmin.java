package demo;
import java.util.*;
public class maxandmin {

	public static void main(String[] args) {
		Random rand = new Random();
        int[] arg = new int[1000000];
        System.out.println("enter the number of elemennts");
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        for (int i = 0; i < n; i++) {
            arg[i] = rand.nextInt(100);
        }

        for (int i = 0; i < n; i++) {
            System.out.println(arg[i]);
        }
        int max=arg[0];
        int min=arg[0];
        long startTime = System.nanoTime();
        for (int i = 1; i < n; i++)
        {
        	if(max<arg[i])
        	{
        		max=arg[i];
        		
        	}
        }
        System.out.println("max element in the array is "+ max);
        for (int i = 1; i < n; i++)
        {
        	if(min>arg[i])
        	{
        		min=arg[i];
        		
        	}
        }
        System.out.println("min element in the array is "+ min);
        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;
        System.out.println("Time elapsed: " + timeElapsed + " nanoseconds");

	}

}