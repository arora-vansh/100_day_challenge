import java.util.Scanner;
import java.lang.Math;
public class normal_trace_matrix {
    public static void main(String[] args)
    {
        try(Scanner scan = new Scanner(System.in))
        {
            int n,m,i,j;
            int[][] a = new int[10][10];
            System.out.print("Enter the number of rows of the matrix:");
            n = scan.nextInt();
            System.out.print("Enter the number of columns of the matrix:");
            m = scan.nextInt();
            System.out.print("Enter the elements of the matrix:");
            for(i=0 ; i<n ; i++)
            {
                for(j=0 ; j<m ; j++)
                {
                    a[i][j] = scan.nextInt();
                }
            }
            System.out.print("The trace of the matrix is " + trace(a,n,m));
            System.out.print("\n The trace of the matrix is " + normal(a,n,m));
        }
    }
    static int trace(int a[][], int n, int m)
    {
        int i,j,sum=0;
        for(i=0 ; i<n ; i++)
        {
            for(j=0 ; j<m ; j++)
            {
                if(i==j)
                sum = sum + a[i][j];
            }
        }
        return sum;
    }
    static double normal(int a[][], int n, int m)
    {
        int i,j,sum=0;
        double nor;
        for(i=0 ; i<n ; i++)
        {
            for(j=0 ; j<m ; j++)
            {
                sum = sum + a[i][j] * a[i][j];
            }
        }
        nor = Math.sqrt(sum);
        return nor;
    }
    
}
