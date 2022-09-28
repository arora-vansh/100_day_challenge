import java.util.Scanner;
public class traverse_diagonal_element_matrix
{
	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)){
		    int n,m,i,j;
		    int[][] a = new int[10][10];
		    System.out.println("Enter the number of rows in the matrix:");
		    n = scan.nextInt();
		    System.out.println("Enter the number of columns in the matrix:");
		    m = scan.nextInt();
		    System.out.println("Enter the elements in the matrix:");
		    for(i=0 ; i<n ; i++)
		    {
		        for(j=0 ; j<m ; j++)
		        {
		            a[i][j] = scan.nextInt();
		        }
		    }
		    System.out.println("Elements present in the diagonal of the matrix are:");
		    for(i=0 ; i<n ; i++)
		    {
		        for(j=0 ; j<m ; j++)
		        {
		            if(i==j)
		            {
		                System.out.print(a[i][j] + " ");
		            }
                    else 
                    continue;
		        }
                System.out.println();
		    }
		}
	}
}