import java.util.Scanner;
public class same_integer_in_two_array {
    public static void main(String[] args)
    {
        try(Scanner scan = new Scanner(System.in))
        {
            int n1,n2,i,j;
            int[] a = new int[100];
            int[] b = new int[100];
            System.out.println("Enter the total numbers of elements of first array:");
            n1 = scan.nextInt();
            System.out.println("Enter the total number of elements of second array:");
            n2 = scan.nextInt();
            System.out.print("Enter the elements in the first array:");
            for(i=0 ; i<n1 ; i++)
            {
                a[i] = scan.nextInt();
            }
            System.out.print("Enter the elements in second array:");
            for(i=0 ; i<n2 ; i++)
            {
                b[i] = scan.nextInt();
            }
            System.out.print("The common elements in the array is ");
            for(i=0 ; i<n1 ; i++)
            {
                for(j=0 ; j<n2 ; j++)
                {
                    if (a[i] == b[j])
                    {
                    System.out.print(a[i] + " ");
                    }
                }
            }
        }
    }
    
}
