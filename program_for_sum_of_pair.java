import java.util.Scanner;
public class program_for_sum_of_pair {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){
            int n,i,j,num;
            int[] a = new int[50];
            System.out.println("Enter the total number of elements in the array:");
            n = scan.nextInt();
            System.out.println("Enter the elements of the array:");
            for(i=0 ; i<n ; i++)
            {
                a[i] = scan.nextInt();
            }
            System.out.println("Enter the number whose sum is to determined:");
            num = scan.nextInt();
            for(i=0 ; i<n ; i++)
            {
                for(j=i+1 ; j<n ; j++)
                {
                    if(a[i]+a[j]==num)
                    System.out.println(a[i] + " + " + a[j] + " = " + num);
                }
            }
        }
    }
    
}
