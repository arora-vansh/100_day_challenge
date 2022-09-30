import java.util.Scanner;
public class calculate_numbers_present_in_matrix {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){
            int n,m,i,j,s,count=0;
            int[][] a = new int[10][10];
            System.out.println("Enter the number of rows in the array:");
            n = scan.nextInt();
            System.out.println("Enter the number of columns in the array:");
            m = scan.nextInt();
            System.out.println("Enter the elements of the matrix:");
            for(i=0 ; i<n ; i++)
            {
                for(j=0 ; j<m ; j++)
                {
                    a[i][j] = scan.nextInt();
                }
            }
            System.out.println("Enter the element that you want to count:");
            s = scan.nextInt();
            for(i=0 ; i<n ; i++)
            {
                for(j=0 ; j<m ; j++)
                {
                    if(s == a[i][j])
                    count = count + 1;
                }
            }
            System.out.println("The number of times " + s + " is present: " + count);
        }
    }
    
}
