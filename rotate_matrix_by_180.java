import java.util.Scanner;
public class rotate_matrix_by_180
{
	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)){
		    int n,m,i,j;
		    int[][] a = new int[10][10];
		    System.out.println("Enter the number of rows in the matrix:");
		    n = scan.nextInt();
		    System.out.println("Enter the number of columns in the matrix:");
		    m = scan.nextInt();
		    System.out.println("Enter the elements of the matrix:");
		    for(i=0 ; i<n ; i++)
		    {
		        for(j=0 ; j<m ; j++)
		        {
		            a[i][j] = scan.nextInt();
		        }
		    }
		    System.out.println("Matrix after rotation is:");
		    for(i=n-1 ; i>=0 ; i--)
		    {
		        for(j=m-1 ; j>=0 ; j--)
		        {
		            System.out.print(a[i][j] + " ");
		        }
		        System.out.println();
		    }
		}
	}
}