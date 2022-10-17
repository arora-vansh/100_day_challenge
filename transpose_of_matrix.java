import java.util.Scanner;
public class transpose_of_matrix {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){
            int r,c,i,j;
            int[][] a = new int[10][10];
            System.out.println("Enter the rows of the matrix:");
            r = scan.nextInt();
            System.out.println("Enter the columns of the matrix:");
            c = scan.nextInt();
            System.out.println("Enter the elements of the matrix:");
            for(i=0 ; i<r ; i++)
            {
                for(j=0 ; j<c ; j++)
                {
                    a[i][j] = scan.nextInt();
                }
            }
            for(i=0 ; i<r ; i++)
            {
                for(j=0 ; j<c ; j++)
                {
                    System.out.print(a[j][i] + " ");
                }
                System.out.println();
            }
        }
    }
    
}
