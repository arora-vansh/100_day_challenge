import java.util.Scanner;
public class cyclic_rotate_array {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){
            int n,i;
            int[] a = new int[20];
            int[] b = new int[20];
            System.out.println("Enter the number of elements in the array:");
            n = scan.nextInt();
            System.out.println("Enter the elements in the array:");
            for(i=0 ; i<n ; i++)
            {
                a[i] = scan.nextInt();
            }
            b[0]=a[n-1];
            for(i=0 ; i<n ; i++)
            {
                b[i+1]=a[i];
            }
            System.out.println("Array after clockwise rotation:");
            for(i=0;i<n;i++)
            {
                System.out.print(" " + b[i]);
            }
        }
    }
    
}
