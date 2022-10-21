import java.util.Scanner;
public class boundary_matrix 
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
            System.out.println("Enter the elements of the matrix:");
            for(i=0 ; i<n ; i++)
            {
                for(j=0 ; j<m ; j++)
                {
                    a[i][j] = scan.nextInt();
                }
            }
            System.out.println("The desired matrix is ");
            boundary(a,n,m);
        }
    }
    static int boundary(int a[][],int n,int m)
    {
        int i,j;
        for(i=0 ; i<n ; i++)
        {
            for(j=0 ; j<m ; j++)
            {
                if(i==0 || j==0 || i==(n-1) || j==(m-1))
                System.out.print(a[i][j] + " ");
                else
                System.out.print("  "); 
            }
            System.out.println();
        }
        return 0;
    }
}
