import java.util.Scanner;
public class sum_of_diagonal_values {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){
            int n,m,i,j,sum = 0;
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
            for(i=0 ; i<n ; i++)
            {
                for(j=0 ; j<m ; j++)
                {
                    if(i==j)
                    sum = sum + a[i][j];
                }
            }
            System.out.println("The sum of elements present in the diagonal is " + sum);
        }
    }
    
}
