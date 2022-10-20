import java.util.Scanner;
public class reverse_alternate_element
{
    public static void main(String[] args)
    {
        try(Scanner scan = new Scanner(System.in))
        {
            int n,i;
            int[] a = new int[50];
            System.out.print("Enter the length of the array:");
            n = scan.nextInt();
            System.out.print("Enter the elemetns of the array:");
            for(i=0 ; i<n ; i++)
            {
                a[i] = scan.nextInt();
            }
            swap(a,n);
        }
    }
    static int swap(int a[],int n)
    {
        int temp,i;
        for(i=0 ; i<n-1 ; i=i+2)
        {
            temp = a[i];
            a[i] = a[i+1];
            a[i+1] = temp;
        }
        for(i=0 ; i<n ; i++)
        System.out.print(a[i] + " ");
        return 0;
    }
}
