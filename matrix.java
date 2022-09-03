import java.util.Scanner;
public class matrix {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.println("Enter the size of square matrix:");
        n = scan.nextInt();
        scan.close();
        mat(n); 
    }
    static int mat(int n){
        for(int i=0 ; i<n ; i++)
        {
            for(int j=0 ; j<n ; j++)
            {
                System.out.print(" " + (int) (Math.random() * 5));
            }
            System.out.println();
        }
        return 1;
    }
}
