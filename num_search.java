import java.util.Random;
import java.util.Scanner;

public class num_search{
    public static void main(String[] args) {

        Random rand = new Random();
        int[] arg = new int[49];

        for (int i = 0; i < 49; i++) {
            arg[i] = rand.nextInt(100);
        }

        for (int i = 0; i < 49; i++) {
            System.out.println(arg[i]);
        }

        System.out.println("Enter the number you want to search:");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int count = 0;
        boolean found = false;

        // Start time calculation
        long startTime = System.currentTimeMillis();

        while (!found) {
            int r = rand.nextInt(49);
            if (arg[r] == x) {
                System.out.println("Found");
                System.out.println("Count is " + count);
                found = true;
            } else {
                count++;
            }
        }

        // End time calculation
        long endTime = System.currentTimeMillis();
        long timeElapsed = endTime - startTime;
        System.out.println("Time elapsed: " + timeElapsed + " milliseconds");
    }
}