import java.util.Random;

public class Reverse_order {
    public static void main(String[] args) {
        int a = 0, b = 0;
        Random rand = new Random();
        int[] nValues = {10, 100, 1000, 10000, 100000};

        for (int n : nValues) {
            int[] arg = new int[n];


            for (int i = 0; i < n; i++) {
                arg[i] = rand.nextInt(100);
            }


            System.out.println("for "+ n + " elements");
            for (int i = 0; i < n; i++) {
                if (arg[i] % 2 == 0) {
                    a++;
                } else {
                    b++;
                }
            }

            System.out.println("The number of even elements: " + a);
            System.out.println("The number of odd elements: " + b);
            System.out.println("reverse order");
            for (int i = n - 1; i >= 0; i--) {
                System.out.println(arg[i]);
            }

            int m = arg[0];
            int j = arg[n - 1];

            System.out.println("The first element in the array: " + m);
            System.out.println("The last element in the array: " + j);
            System.out.println();


            a = 0;
            b = 0;
        }
    }
}