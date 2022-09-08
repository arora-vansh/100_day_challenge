import java.util.Scanner;
public class sum_of_index {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){
            int n,i,i1,i2,sum;
            int[] a = new int[20];
            System.out.println("Enter the total number of elements in the array:");
            n = scan.nextInt();
            System.out.println("Enter the elements in the array:");
            for(i=0 ; i<n ; i++)
            {
                a[i]=scan.nextInt();
            }
            System.out.println("Enter the first index:");
            i1 = scan.nextInt();
            System.out.println("Enter the second index:");
            i2 = scan.nextInt();
            sum = a[i1] + a[i2];
            System.out.println("The sum of numbers present at two index is " + sum);
        }
    }
    
}
