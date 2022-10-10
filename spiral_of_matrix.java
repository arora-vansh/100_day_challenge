import java.util.Scanner;
public class spiral_of_matrix {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){
            int n,m,i,j;
            int a[][] = new int[20][20];
            System.out.println("Enter the number of rows in the matrix:");
            n = scan.nextInt();
            System.out.println("Enter the number of columns in the matrix:");
            m = scan.nextInt();
            System.out.println("Enter the elements of the array:");
            for(i=0 ; i<n ; i++)
            {
                for(j=0 ; j<m ; j++)
                {
                    a[i][j] = scan.nextInt();
                }
            }
            Spiral(n,m,a);
        }
    }

    static int Spiral(int n,int m,int a[][])
    {
        int i,k=0,l=0;
        while(k<m && l<n)
        {
            for(i=l ; i<n ; ++i)
            {
                System.out.print(a[k][i] + " ");
            }
            k++;
            for (i = k; i < m; ++i) {
                System.out.print(a[i][n - 1] + " ");
            }
            n--;
 
            if (k < m) {
                for (i = n - 1; i >= l; --i) {
                    System.out.print(a[m - 1][i] + " ");
                }
                m--;
            if (l < n) {
                for (i = m - 1; i >= k; --i) {
                    System.out.print(a[i][l] + " ");
                }
                l++;       
        }
    }
        }   
        return 0; 
    }
}