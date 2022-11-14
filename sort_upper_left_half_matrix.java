import java.util.Scanner;
public class sort_upper_left_half_matrix 
{
    public static void main(String[] args)
    {
        try(Scanner scan = new Scanner(System.in))
        {
            int r,c,i,j,temp;
            int[][] a = new int[10][10];
            System.out.print("Enter the number of rows in the matrix:");
            r = scan.nextInt();
            System.out.print("Enter the number of columns in the matrix:");
            c = scan.nextInt();
            System.out.print("Enter the elements of the matrix:");
            for(i=0 ; i<r ; i++)
            {
                for(j=0 ; j<c ; j++)
                {
                    a[i][j] = scan.nextInt();
                }
            }
            for(i=0 ; i<r ; i++)
            {
                for(j=c-1-i ; j>=0 ; j--)
                {
                    for(int k=0 ; k<j ; k++)
                    {
                        if(a[i][k]>a[i][k+1])
                        {
                            temp = a[i][k];
                            a[i][k] = a[i][k+1];
                            a[i][k+1] = temp;
                        }
                    }
                }
            }
            System.out.println("The desired result is:");
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
