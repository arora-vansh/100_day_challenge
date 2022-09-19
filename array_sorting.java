import java.util.Scanner;
public class array_sorting {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){
            int n,i,j,temp;
            int[] a = new int[20];
            System.out.println("Enter the total number of elements in the array:");
            n = scan.nextInt();
            System.out.println("Enter the elements of the array:");
            for(i=0 ; i<n ;i++)
            {
                a[i] = scan.nextInt();
            }
            for(i=0 ; i<n ; i++)
            {
                for(j=i+1 ; j<n ; j++)
                {
                    if(a[i]>a[j])
                    {
                        temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;
                    }
                }
            }
            System.out.println("The sorted array is");
            for(i=0 ; i<n ; i++)
            {
                System.out.print(a[i] + " ");
            }
        }
    }
    
}
