import java.util.Scanner;
public class sum_of_two_array {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){
            int m,n,i,j;
            int[][] a = new int[20][20];
            int[][] b = new int[20][20];
            int[][] c = new int[20][20];
            System.out.println("Enter the size of array:");
            m = scan.nextInt();
            n = scan.nextInt();
            System.out.println("Enter the elements in first array:");
            for(i=0 ; i<m ; i++){
                for(j=0 ; j<n ; j++){
                    a[i][j] = scan.nextInt();
                }
            }
            System.out.println("Enter the elements in second array:");
            for(i=0 ; i<m ; i++){
                for(j=0 ; j<n ; j++){
                    b[i][j] = scan.nextInt();
                }
            }
            for(i=0 ; i<m ; i++){
                for(j=0 ; j<n ; j++){
                    c[i][j] = a[i][j] + b[i][j];
                }
            }
            System.out.println("The sum of two matrix is ");
            for(i=0 ; i<m ; i++){
                for(j=0 ; j<n ; j++){
                    System.out.println("" + c[i][j]);
                }
            }
        }
    }
    
}
