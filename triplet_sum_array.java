import java.util.Scanner;
public class triplet_sum_array 
{
    public static void main(String[] args)
    {
        try(Scanner scan = new Scanner(System.in))
        {
            int n,i,j,k,s;
            int[] a = new int[50];
            System.out.print("Enter the size of the array:");
            n = scan.nextInt();
            System.out.print("Enter the elements in the array:");
            for(i=0 ; i<n ; i++)
            a[i] = scan.nextInt();
            System.out.print("Enter the number whose sum is to be determined:");
            s = scan.nextInt();
            System.out.println("The triplets are");
            for(i=0 ; i<n ; i++)
            {
                for(j=i+1 ; j<n ; j++)
                {
                    for(k=j+1 ; k<n ; k++)
                    if((a[i]+a[j]+a[k]) == s)
                    System.out.println(a[i] + " " + a[j] + " " + a[k]);
                }
            }
        }
    }
}
