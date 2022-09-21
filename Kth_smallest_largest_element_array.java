import java.util.Scanner;
public class Kth_smallest_largest_element_array {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){
            int n,i,j,temp,k;
            int[] a = new int[100];
            System.out.println("Enter the total number of elements in the array:");
            n = scan.nextInt();
            System.out.println("Enter the elements in the array:");
            for(i=0 ; i<n ; i++)
            {
                a[i] = scan.nextInt();
            }
            System.out.println("Enter the Kth value:");
            k = scan.nextInt();
            for(i=0 ; i<n ; i++)
            {
                for(j=i+1 ; j<n ; j++)
                {
                    if(a[j]<a[i])
                    {
                        temp=a[i];
                        a[i]=a[j];
                        a[j]=temp;
                    }
                }
            }
            System.out.println("The " + k + " smallest element is " + a[k-1]);
            System.out.println("The " + k + " largest element is " + a[n-k]);
        }
    }
    
}
