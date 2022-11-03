import java.util.Scanner;
public class check_negative_dominant 
{
    public static void main(String[] args)
    {
        try(Scanner scan = new Scanner(System.in))
        {
            int s,i,p=0,n=0;
            int[] a = new int[50];
            System.out.print("Enter the number of elements in the array:");
            s = scan.nextInt();
            System.out.print("Enter the elements of the array:");
            for(i=0 ; i<s ; i++)
            a[i] = scan.nextInt();
            for(i=0 ; i<s ; i++)
            {
                if(a[i] < 0)
                n++;
                else if(a[i] > 0)
                p++;
            }
            if(n>p)
            System.out.print("The array is negative dominant");
            else if(p>n)
            System.out.print("The array is positive dominant" + p);
            else
            System.out.print("The array is neutral");
        }
    }
}
