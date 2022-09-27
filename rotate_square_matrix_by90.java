import java.util.Scanner;
public class rotate_square_matrix_by90 {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){
            int n,i,j;
            int[][] a = new int[10][10];
            System.out.println("Enter the size of square matrix:");
            n = scan.nextInt();
            System.out.println("Enter the elements in the matrix:");
            for(i=0 ; i<n ; i++){
                for(j=0 ; j<n ; j++){
                    a[i][j] = scan.nextInt();
                }
            }
            for(i=0 ; i<n ; i++){
                for(j=0 ; j<n ; j++){
                    System.out.print(a[j][i] + " ");
                }
                System.out.println();
            }
        }
    }
    
}
