import java.util.Scanner;
public class check_array {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){
        int n,m,i,count=0;
        int[] a = new int[50];
        int[] b = new int[50];
        System.out.println("Enter the number of elements in array1:");
        n = scan.nextInt();
        System.out.println("Enter the elements of array1:");
        for(i=0 ; i<n ; i++)
        {
            a[i] = scan.nextInt();
        }
        System.out.println("Enter the number of elements in array2:");
        m = scan.nextInt();
        System.out.println("Enter the elements of array2:");
        for(i=0 ; i<m ; i++)
        {
            b[i] = scan.nextInt();
        }
        for(i=0 ; i<n ; i++)
        {
            count = 0;
            if(a[i]!=b[i])
            {
                count = count + 1;
            System.out.println("The two arrays are not same");
            break;
        }
    }
    if(count==0)
    System.out.println("The arrays are same");
        }
        }
    }    

