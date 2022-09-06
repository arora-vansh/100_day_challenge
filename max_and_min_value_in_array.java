import java.util.Scanner;
public class max_and_min_value_in_array {
    public static void main(String[] args){
    try (Scanner scan = new Scanner(System.in)){
        int i,j,n,temp;
        int[] a = new int[100];
        System.out.println("Enter the total numbers of elements in the array:");
        n = scan.nextInt();
        System.out.println("Enter the elements in the array:");
        for(i=0 ; i<n ; i++)
        {
            a[i]=scan.nextInt();
        }
        for(i=0 ; i<n ; i++)
        {
            for(j=i+1 ; j<n ; j++)
            if(a[j]>a[i])
            {
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
        System.out.print("The maximum number is " + a[0]);
        System.out.println("\nThe minimum number is " + a[n-1]);
    }
}
    
}
