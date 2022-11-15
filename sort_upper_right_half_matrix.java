import java.util.Scanner;
public class sort_upper_right_half_matrix 
{
    public static void main(String[] args)
    {
        try(Scanner scan = new Scanner(System.in))
        {
            int r,c,i,j,k,temp;
            int[][] a = new int[10][10];
            System.out.print("Enter number of rows in the matrix:");
            r = scan.nextInt();
            System.out.print("Enter number of columns in the matrix:");
            c = scan.nextInt();
            System.out.print("Enter the elements in the matrix:");
            for(i=0 ; i<r ; i++)
            {
                for(j=0 ; j<c ; j++)
                {
                    a[i][j] = scan.nextInt();
                }
            }
            System.out.print("The desired result is:");
            for(i=1 ; i<r ; i++)
            {
                for(j=i ; j<c ; j++)
                {
                    for(k=i ; k<c ; k++)
                    {
                        if(a[i][k] > a[i][k+1])
                        {
                            temp = a[i][k];
                            a[i][k] = a[i][k+1];
                            a[i][k+1] = temp;
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
