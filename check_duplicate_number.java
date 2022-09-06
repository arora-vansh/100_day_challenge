import java.util.Scanner;
public class check_duplicate_number {
    public static void main(String[] args)
    {
        try(Scanner scan = new Scanner(System.in))
        {
            int n,i,j;
            int[] a = new int[100];
            System.out.println("Enter the number of elements in the array:");
            n = scan.nextInt();
            System.out.println("Enter the elements of the array:");
            for(i=0 ; i<n ; i++)
            {
                a[i] = scan.nextInt();
            }
            System.out.print("The duplicate numbers are ");
            for(i=0 ; i<n ; i++)
            {
                for(j=i+1 ; j<n ; j++)
                {
                    if(a[i]==a[j])
                    System.out.print(a[i] + " ");
                }
            }
        }
    }
    
}
