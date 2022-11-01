import java.util.Scanner;
public class pair_sum_array 
{
    public static void main(String[] args)
    {
        try(Scanner scan = new Scanner(System.in))
        {
            int n,i,j,s;
            int[] a = new int[50];
            System.out.print("Enter the number of elements in the array:");
            n = scan.nextInt();
            System.out.print("Enter the number of element of the array:");
            for(i=0 ; i<n ; i++)
            {
                a[i] = scan.nextInt();
            }
            System.out.print("Enter the number for which you want to determine the sum:");
            s = scan.nextInt();
            for(i=0 ; i<n ; i++)
            {
                for(j=i+1 ; j<n ; j++)
                {
                    if((a[i]+a[j]) == s)
                    System.out.println(a[i] + " " + a[j]);
                }
            }
        }
    }
}
