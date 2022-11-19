import java.util.Scanner;
public class sort_each_column_of_matrix 
{
    public static void main(String[] args)
    {
        try(Scanner scan = new Scanner(System.in))
        {
            int r,c,i,j,k,temp;
            int[][] a = new int[10][10];
            System.out.print("Enter the number of rows of the matrix:");
            r = scan.nextInt();
            System.out.print("Enter the number of columns of the matrix:");
            c = scan.nextInt();
            System.out.print("Enter the elements of the matrix:");
            for(i=0 ; i<r ; i++)
            {
                for(j=0 ; j<c ; j++)
                {
                    a[i][j] = scan.nextInt();
                }
            }
            for(i=0 ; i<c ; i++)
            {
                for(j=r-1 ; j>0 ; j--)
                {
                    for(k=0 ; k<j ; k++)
                    {
                        if(a[k][i] > a[k+1][i])
                        {
                            temp = a[k][i];
                            a[k][i] = a[k+1][i];
                            a[k+1][i] = temp;
                        }
                    }
                }
            }
            for(i=0 ; i<r ; i++)
            {
                for(j=0 ; j<c ; j++)
                {
                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
