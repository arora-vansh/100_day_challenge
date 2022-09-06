import java.util.Scanner;
public class remove_duplicate_elements {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){
            int n,i,j;
            int[] a = new int[100];
            int[] b = new int[100];
            System.out.println("Enter the total numbers of elements in the array:");
            n = scan.nextInt();
            System.out.println("Enter the elements in the array:");
            for(i=0 ; i<n ; i++)
            {
                a[i] = scan.nextInt();
            }
            System.out.println("The value of new array is ");
            for(i=0 ; i<n ; i++)
            {
                for(j=i+1 ; j<n ; j++)
                {
                    if(a[i]==a[j])
                    b[i]=a[i];
                }
            }
            for(i=0 ; i<n ; i++)
            {
                if(a[i] != b[i])
                System.out.print(a[i] + " ");
            }
        }
    }
    
}
