import java.util.Scanner;
public class array_reverse {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){
        int n,i;
        int[] a = new int[50];
        int[] b = new int[50];
        System.out.println("Enter the total number of elements of the array:");
        n = scan.nextInt();
        System.out.println("Enter the number of elements of the array:");
        for(i=0 ; i<n ; i++)
        {
            a[i] = scan.nextInt();
        }
        System.out.println("The reverse of the array is ");
        for(i=0 ; i<n ; i++)
        {
            b[n-1-i] = a[i];
        }
        for(i=0 ; i<n ; i++)
        System.out.print(b[i] + " ");
    }
}
    
}
