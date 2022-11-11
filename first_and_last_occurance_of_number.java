import java.util.Scanner;
public class first_and_last_occurance_of_number 
{
    public static void main(String[] args)
    {
        try(Scanner scan = new Scanner(System.in))
        {
            int n,i,s;
            int[] a = new int[50]; 
            System.out.print("Enter the number of elements in the array:");
            n = scan.nextInt();
            System.out.print("Enter the elements in the array:");
            for(i=0 ; i<n ; i++)
            {
                a[i] = scan.nextInt();
            }
            System.out.print("Enter the element whose occurance is to be determined:");
            s = scan.nextInt();
            for(i=0 ; i<n ; i++)
            {
                if(a[i] == s)
                {
                    System.out.print("Index of its first occurance is " + i);
                    break;
                }
            }
            for(i=n-1 ; i>=0 ; i--)
            {
                if(a[i] == s)
                {
                    System.out.print("\nIndex of its last occurance is " + i);
                    break;
                }
            }
        }
    }
}
