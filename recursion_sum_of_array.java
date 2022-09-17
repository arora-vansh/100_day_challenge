import java.util.Scanner;
public class recursion_sum_of_array {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){
            int n,i;
            int[] a = new int[20];
            System.out.println("Enter the total number of elements in the array:");
            n = scan.nextInt();
            System.out.println("Enter the elements of the array:");
            for(i=0 ; i<n ; i++)
            {
                a[i] = scan.nextInt();
            }
            System.out.println("The sum of elements of the array is " + sum(n,a));
        }
    }
        static int sum(int n,int a[]){
            if(n==0)
            return 0;
            return (sum(n-1,a) + a[n-1]);
        }
    
}
