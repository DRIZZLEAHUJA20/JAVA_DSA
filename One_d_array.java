import java.util.*;
public class One_d_array{
    public static void main(String[] args){
        int a[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements ");
        for(int i=0;i<5;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("elements are ");
        for(int i=0;i<5;i++){
            System.out.println(a[i]);
        }
    }
}