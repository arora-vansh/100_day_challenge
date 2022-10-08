import java.util.Scanner;
public class change_row_column_matrix {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){
            int n,m,i,j;
            int[][] a = new int[10][10];
            int[][] b = new int[10][10];
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
            for(i=0 ; i<n ; i++)
            {
                for(j=0 ; j<m ; j++)
                {
                    b[j][i] = a[i][j];
                    System.out.print(b[j][i] + " ");
                }
                System.out.println();
            }
        }
    }
    
}
