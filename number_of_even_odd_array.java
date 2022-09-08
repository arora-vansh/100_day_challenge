import java.util.Scanner;
public class number_of_even_odd_array {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){
            int n,i,o=0,e=0;
            int[] a = new int[50];
            System.out.println("Enter the number elements of in the array:");
            n = scan.nextInt();
            System.out.println("Enter the elements of the array:");
            for(i=0 ; i<n ; i++)
            {
                a[i] = scan.nextInt();
            }
            for(i=0 ; i<n ; i++)
            {
                if(a[i]%2 == 0)
                e=e+1;
                else
                o=o+1;
            }
            System.out.println("The number of even numbers in the array are " + e);
            System.out.println("The number of odd numbers in the array are " + o);
        }
    }
    
}
