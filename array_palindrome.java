import java.util.Scanner;
public class array_palindrome 
{
    public static void main(String[] args)
    {
        try(Scanner scan = new Scanner(System.in))
        {
            int n,i;
            int[] a = new int[50];
            System.out.print("Enter the length of the array:");
            n = scan.nextInt();
            System.out.print("Enter the elements of the array:");
            for(i=0 ; i<n ; i++)
            {
                a[i] = scan.nextInt();
            }
            if(check(a,n)==0)
            System.out.print("The array is not palindrome");
            else
            System.out.print("The array is palindrome");
        }
    }
    static int check(int a[],int n)
    {
        for(int i=0 ; i < n/2 ;)
        {
            if(a[i] != a[n-1-i])
            return 0;
            else 
            return 1;
        }
        return 0;
    }
}
