import java.util.Scanner;

public class Array_search {
    static int Search(int a[],int value){
            for(int i=0;i<a.length;i++){
                if(a[i]==value){
                    return i;
                }
            }
            return -1;
        }
        public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            int a[] = new int[5];
            System.out.println("Enter elements ");
            for(int i=0;i<5;i++){
                a[i]=sc.nextInt();
            }
            System.out.println("elements are ");
            for(int i=0;i<5;i++){
                System.out.println(a[i]);
            }
            System.out.println("Enter value to search :");
            int value = sc.nextInt();
            int indexValue = Search(a, value);
            if(indexValue==-1){
                System.out.println("element not found");
            }
            else{
                System.out.println("element is at index "+indexValue);
            }
        }
    }
}
