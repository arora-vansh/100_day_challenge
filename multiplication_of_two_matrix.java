import java.util.Scanner;
public class multiplication_of_two_matrix {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){
            int n1,n2,m1,m2,i,j,k;
            int[][] a = new int[10][10];
            int[][] b = new int[10][10];
            int[][] c = new int[10][10];
            System.out.println("Enter the number of rows in the first matrix:");
            n1 = scan.nextInt();
            System.out.println("Enter the number of columns in the first matrix:");
            n2 = scan.nextInt();
            System.out.println("Enter the elements of first matrix:");
            for(i=0 ; i<n1 ; i++)
            {
                for(j=0 ; j<n2 ; j++)
                {
                    a[i][j] = scan.nextInt();
                }
            }
            System.out.println("Enter the number of rows in the second matrix:");
            m1 = scan.nextInt();
            System.out.println("Enter the number of columns in the second matrix:");
            m2 = scan.nextInt();
            System.out.println("Enter the elements of second matrix:");
            for(i=0 ; i<m1 ; i++)
            {
                for(j=0 ; j<m2 ; j++)
                {
                    b[i][j] = scan.nextInt();
                }
            }
            System.out.println("The multiplication of two matrix is:");
            if(n2 == m1)
            {
                for(i=0 ; i<n1 ; i++)
                {
                    for(j=0 ; j<m2 ; j++)
                    {
                        for(k=0 ; k<m2 ; k++)
                        {
                            c[i][j] += a[i][k]*b[k][j];
                        }
                        System.out.print(c[i][j] + " ");
                    }
                    System.out.println();
                }
            }
            else
            System.out.print("Multiplication is not possible");
        }
    }
    
}
