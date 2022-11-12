import java.util.Scanner;
public class sort_diagonal_of_matrix 
{    public static void main(String[] args)
    {
        try(Scanner scan = new Scanner(System.in))
        {
            int i,j,n,m,temp;
            int[][] a = new int[10][10];
            System.out.print("Enter the number of rows in the matrix:"); 
            n=scan.nextInt();
            System.out.print("Enter the number of columns in the matrix:");
            m=scan.nextInt();
            for(i=0 ; i<n ; i++)
            {
                for(j=0 ; j<m ; j++)
                {
                    a[i][j] = scan.nextInt();
                }
            }
            for(i=0 ; i<n ; i++)
            {
                for(j=i+1 ; j<n ; j++)
                {
                    if(a[i][i]>a[j][j])
                    {
                        temp = a[i][i];
                        a[i][i] = a[j][j];
                        a[j][j] = temp;
                    }
                }
            }
            for(i=0 ; i<n ; i++)
            {
                for(j=0 ; j<m ; j++)
                {
                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
