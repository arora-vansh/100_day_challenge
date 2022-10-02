import java.util.Scanner;
public class row_wise_sum_matrix {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){
            int n,m,i,j,sum;
            int[][] a = new int[10][10];
            System.out.println("Enter the total number of rows in the matrix:");
            n = scan.nextInt();
            System.out.println("Enter the total number of columns in the matrix:");
            m = scan.nextInt();
            System.out.println("Enter the elements of the matrix:");
            for(i=0 ; i<n ; i++)
            {
                for(j=0 ; j<m ; j++)
                {
                    a[i][j] = scan.nextInt();
                }
            }
            System.out.println("The sum of each row is:");
            for(i=0 ; i<n ; i++)
            {
                sum = 0;
                for(j=0 ; j<m ; j++)
                {
                    sum = sum + a[i][j];
                }
                System.out.println(sum + " ");
            }
        }
    }
    
}
