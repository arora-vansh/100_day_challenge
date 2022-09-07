import java.util.Scanner;
public class second_smallest_number_array {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){
            int n,i,j,temp;
            int[] a = new int[100];
            System.out.println("Enter the total number of elements in the array:");
            n = scan.nextInt();
            System.out.println("Enter the elements in the array:");
            for(i=0 ; i<n ; i++)
            {
                a[i] = scan.nextInt();
            }
            for(i=0 ; i<n ; i++)
            {
                for(j=i+1 ; j<n ; j++)
                {
                    if(a[j]>a[i])
                    {
                        temp=a[i];
                        a[i]=a[j];
                        a[j]=temp;
                    }
                }
            }
            System.out.println("The second smallest element is " + a[n-2]);
        }
    }
    
}
