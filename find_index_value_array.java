import java.util.Scanner;
public class find_index_value_array {
    public static void main(String[] args){
       try (Scanner scan = new Scanner(System.in)){
        int i,n,s;
        int[] a = new int[100];
        System.out.println("Enter the number of elements you want to enter into the array:");
        n = scan.nextInt();
        System.out.println("Enter the numbers in the array:");
        for(i=0 ; i<n ; i++)
        {
            a[i] = scan.nextInt();
        }
        System.out.println("Enter the number whose index you want to determine:");
        s = scan.nextInt();
        for(i=0 ; i<n ; i++)
        {
            if(a[i] == s)
            {
                System.out.println("Element is at index " + i);
                break;
            }

        }
    }
}
}
