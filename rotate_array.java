import java.util.Scanner;
public class rotate_array {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){
            int n,m,i;
            int[] a = new int[200];
            int[] b = new int[200];
            System.out.println("Enter the number of elements in the array:");
            n = scan.nextInt();
            System.out.println("Enter the elements of the array:");
            for(i=0 ; i<n ; i++)
            {
                a[i] = scan.nextInt();
            }
            System.out.println("Enter the times you want to rotate the array:");
            m = scan.nextInt();
            for(i=0 ; i<n ; i++)
            {
                b[i] = a[m+i];
            }
            System.out.println("The desired output is:");
            for(i=0 ; i<n ; i++)
            {
                if(i<=m)
                System.out.print(b[i] + " ");
            }
            for(i=0 ; i<m ; i++)
            {
                System.out.print(a[i] + " ");
            }
        }
    }
    
}
