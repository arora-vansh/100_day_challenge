import java.util.Scanner;
public class check_element_in_array {
    public static void main(String[] args){
       try (Scanner scan = new Scanner(System.in)){
        int n,i,s;
        int[] a = new int[100];
        System.out.println("Enter the number of elements that you want to enter into the array:");
        n = scan.nextInt();
        System.out.println("Enter the elements of the array:");
        for(i=0 ; i<n ; i++)
        {
            a[i] = scan.nextInt();
        }
        System.out.println("Enter the number which you want to search:");
        s = scan.nextInt();
        for(i=0 ; i<n ; i++)
        {
            if(a[i] == s)
            {System.out.print("The number is present in the array");
            break;}
            else if(i==n-1)
            System.out.println("The number is not present in the array");   
        }
        }
    }
}
