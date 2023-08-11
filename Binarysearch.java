package demo;



import java.util.*;

public class Binarysearch {
    public static void main(String[] args) {

        Random rand = new Random();
        int[] nValues = {10, 100, 1000, 10000, 100000};

        for (int n : nValues) {
            int[] arg = new int[n];


            for (int i = 0; i < n; i++) {
                arg[i] = rand.nextInt(100);
            }
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (arg[j] > arg[j + 1]) {
                        int temp = arg[j];
                        arg[j] = arg[j + 1];
                        arg[j + 1] = temp;
                    }
                }  }
            for (int i = 0; i < n; i++)
            {
                System.out.println(arg[i]);
            }
            int key;
            System.out.println("enter the element u want to find index of ");
            Scanner sc= new Scanner(System.in);
            key=sc.nextInt()
            ;
            long startTime = System.nanoTime();
            int last=arg.length-1;
            int first=0;
            int mid = (first + last)/2;
            while( first <= last ){
                if ( arg[mid] < key ){
                    first = mid + 1;
                }else if ( arg[mid] == key ){
                    System.out.println("Element is found at index: " + mid);
                    break;
                }else{
                    last = mid - 1;
                }
                mid = (first + last)/2;
            }
            if ( first > last ){
                System.out.println("Element is not found!");
            }
           
            long endTime = System.nanoTime();
            long timeElapsed = endTime - startTime;
            System.out.println("Time elapsed for " + n + " elements: " + timeElapsed + " nanoseconds");
            
            System.out.println();

        }
        }}