import java.util.Scanner;
public class remove_duplicate_value {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){
            int n,i,j,s=0;
            int[] a = new int[20];
            int[] b = new int[20];
            System.out.println("Enter the total number of elements in the array:");
            n = scan.nextInt();
            System.out.println("Enter the elements in the array:");
            for(i=0 ; i<n ; i++)
            {
                a[i] = scan.nextInt();
            }
            for(i=1 ; i<n ; i++)
            {
                for(j=i+1 ; j<n ;)
                {
                    if(a[i] != a[j])
                    b[i]=a[i];
                    break;
                }
            }
            for(i=0 ; i<n ; i++)
            {
                if(b[i]>0)
                s=s+1;
            }
            System.out.println("The length of array is " + s);
        }
    }
    
}
