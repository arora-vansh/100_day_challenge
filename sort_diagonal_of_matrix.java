import java.util.Scanner;
public class sort_diagonal_of_matrix 
{


    public static void main(String[] args)
    {
        try(Scanner scan = new Scanner(System.in))
        {

        int i,j,n,m,temp;
        int[][] a = new int[10][10]; 
        n=scan.nextInt();
        m=scan.nextInt();
        for(i=0 ; i<n ; i++){
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
                    {
                        for(int k=1 ; k<n ; k++){
                        if(a[i][j] > a[i+k][j+k])
                        {
                            temp = a[i][j];
                            a[i][j] = a[i+1][j+1];
                            a[i+k][j+k] = temp;
                        }
                    }
                }
            }
            for(i=0 ; i<n ; i++)
            {
                for(j=0 ; j<m ; j++)
                {
                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
}