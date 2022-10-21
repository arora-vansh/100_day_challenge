import java.util.Scanner;
public class interchange_first_last_element_matrixcolumn 
{
    public static void main(String[] args)
    {
        try(Scanner scan = new Scanner(System.in))
        {
            int n,m,i,j;
            int[][] a = new int[10][10];
            System.out.print("Enter the number of rows in the matrix:");
            n = scan.nextInt();
            System.out.print("Enter the number of columns in the matrix:");
            m = scan.nextInt();
            System.out.print("Enter the elements of the matrix:");
            for(i=0 ; i<n ; i++)
            {
                for(j=0 ; j<m ; j++)
                {
                    a[i][j] = scan.nextInt();
                }
            }
            System.out.println("The desired matrix is ");
            change(a,n,m);
        }
    }
    static int change(int a[][],int n,int m)
    {
        int i,j,temp;
        for(i=0 ; i<n ; i++)
        {
            for(j=0 ; j<m ; )
            {
                temp = a[i][m-1];
                a[i][m-1] = a[i][j];
                a[i][j] = temp;
                break;
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
        return 0;
    }
}
