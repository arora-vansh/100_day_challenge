import java.util.Scanner;
public class equality_of_array {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){
            int n,i,s=0;
            int[] a = new int[20];
            int[] b = new int[20];
            System.out.println("Enter the total numbers of elements in the array:");
            n = scan.nextInt();
            System.out.println("Enter the elements of the first array:");
            for(i=0 ; i<n ; i++)
            {
                a[i] = scan.nextInt();
            }
            System.out.println("Enter the elements of the second array");
            for(i=0 ; i<n ; i++)
            {
                b[i] = scan.nextInt();
            }
            for(i=0 ; i<n ; i++)
            {
                if(a[i] == b[i])
                s=s+1;
            }
            if(s == n)
            System.out.print("The two arrays are equivalent");
            else
            System.out.print("The two arrays are not equivalent");
        }
    }
    
}
