import java.util.Scanner;
public class frequency_of_odd_even_matrix 
{
    public static void main(String[] args)
    {
        try(Scanner scan = new Scanner(System.in))
        {
            int r,c,o=0,e=0,i,j;
            int[][] a = new int[10][10];
            System.out.print("Enter the number of rows of the matrix:");
            r = scan.nextInt();
            System.out.print("Enter the number of columns of the matrix:");
            c = scan.nextInt();
            System.out.print("Enter the elements of the matrix:");
            for(i=0 ; i<c ; i++)
            {
                for(j=0 ; j<r ; j++)
                {
                    a[i][j] = scan.nextInt();
                }
            }
            for(i=0 ; i<c ; i++)
            {
                for(j=0 ; j<r ; j++)
                {
                    if(a[i][j] % 2 == 0)
                    e++;
                    else
                    o++;
                }
            }
            System.out.print("Frequency of even numbers in the matrix is " + e);
            System.out.print("\nFrequency of odd numbers in the matrix is " + o);
        }
    }    
}
