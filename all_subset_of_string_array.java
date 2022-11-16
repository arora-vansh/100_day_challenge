import java.util.Scanner;
public class all_subset_of_string_array 
{
    public static void main(String[] args)
    {
        try(Scanner scan = new Scanner(System.in))
        {
            int n;
            System.out.print("Enter the number of characters:");
            n = scan.nextInt();
            char[] a = new char[50]; 
            System.out.print("Enter the characters:");
            for(int i=0 ; i<n ; i++)
            {
                a[i] = scan.next().charAt(0);
            }
            for(int i=0 ; i<(1<<n) ; i++)
            {
                System.out.print("{");
                for(int j=0 ; j<n ; j++)
                {
                    if((i & (1<<j))>0)
                    {
                        System.out.print(a[j] + " ");
                    }
                }
                System.out.print("}");
            }
        }
    }
}
