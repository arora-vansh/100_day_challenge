import java.util.Scanner;
public class print_element_odd_location 
{
    public static void main(String[] args)
    {
        try(Scanner scan = new Scanner(System.in))
        {
            int n,i;
            int[] a = new int[50];
            System.out.println("Enter the length of the array:");
            n = scan.nextInt();
            System.out.println("Enter the elements of the array:");
            for(i=0 ; i<n ; i++)
            {
                a[i] = scan.nextInt();
            }
            System.out.println("The desired result is ");
            print(a,n);
        }
    }
    static int print(int a[],int n)
    {
        int i;
        for(i=0 ; i<n ; i++)
        {
            if(a[i] % 2 != 0)
            {
                System.out.print(a[i] + " ");
            }
        }
        return 0;
    }
}
