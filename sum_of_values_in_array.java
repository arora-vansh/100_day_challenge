import java.util.Scanner;
public class sum_of_values_in_array {
    public static void main(String[] args){
       try (Scanner scan = new Scanner(System.in)){
        int[] a = new int[100];
        int n,i,sum=0;
        System.out.println("Enter the total numbers you want to enter in the array:");
        n = scan.nextInt();
        System.out.print("Enter the numbers:");
        for(i=0 ; i<n ; i++){
            a[i] = scan.nextInt();
        }
        for(i=0 ; i<n ; i++)
        {
            sum = sum + a[i];
        }
        System.out.println("The sum of the numbers in array is " + sum);
    }
}
}
