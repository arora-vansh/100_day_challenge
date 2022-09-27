import java.util.Scanner;
public class sum_of_two_matrix
{
	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)){
		    int n,m,i,j;
		    int[][] a = new int[10][10];
		    int[][] b = new int[10][10];
		    int[][] c = new int[10][10];
		    System.out.println("Enter the number of rows in the matrix:");
		    n = scan.nextInt();
		    System.out.println("Enter the number of columns in the matrix:");
		    m = scan.nextInt();
		    System.out.println("Enter the elements in the first matrix:");
		    for(i=0 ; i<n ; i++)
		    {
		        for(j=0 ; j<m ; j++)
		        {
		            a[i][j] = scan.nextInt();
		        }
		    }
		    System.out.println("Enter the elements in second matrix:");
		    for(i=0 ; i<n ; i++)
		    {
		        for(j=0 ; j<m ; j++)
		        {
		            b[i][j] = scan.nextInt();
		        }
		    }
		    System.out.println("The sum of two matrices are:");
		    for(i=0 ; i<n ; i++)
		    {
		        for(j=0 ; j<m ; j++)
		        {
		            c[i][j] = a[i][j] + b[i][j];
		            System.out.print(c[i][j] + " ");
		        }
				System.out.println();
		    }
		}
	}
}