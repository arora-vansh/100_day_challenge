import java.util.Scanner;
public class increment_array_element 
{
    public static void main(String[] args)
    {
        try(Scanner scan = new Scanner(System.in))
        {
            int n,temp,i;
            System.out.print("Enter the size of the array:");
            n = scan.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            System.out.print("Enter the elements of the array:");
            for(i=0 ; i<n ; i++)
            a[i] = scan.nextInt();
            System.out.print("Enter the number you want for increment:");
            temp = scan.nextInt();
            System.out.println("The elements of the array after increment:");
            for(i=0 ; i<n ; i++)
            {
                b[i] = a[i] + temp;
                System.out.print(b[i] + " ");
            }
        }
    }    
}
