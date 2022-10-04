import java.util.Scanner;
public class push_zeroes_to_end {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){
            int n,i,temp=0;
            int[] a = new int[40];
            System.out.println("Enter the total number of elements in the array:");
            n = scan.nextInt();
            System.out.println("Enter the elements in the array:");
            for(i=0 ; i<n ; i++)
            {
                a[i] = scan.nextInt();
            }
            for (i = 0; i < n; i++)
         {   if (a[i] != 0)
                a[temp++] = a[i];
        }
        while (temp < n)
            a[temp++] = 0;
            System.out.println("The desired array is ");
            for(i=0 ; i<n ; i++)
            {
                System.out.print(a[i] + " ");
            }
        }
    }
    
}
