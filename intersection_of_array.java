import java.util.Scanner;
public class intersection_of_array {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){
            int n1,n2,i,j,m=0;
            int[] a = new int[50];
            int[] b = new int[50];
            int[] c = new int[100];
            System.out.println("Enter the total number of elements in the first array:");
            n1 = scan.nextInt();
            System.out.println("Enter the elements of first array:");
            for(i=0 ; i<n1 ; i++)
            {
                a[i] = scan.nextInt();
            }
            System.out.println("Enter the total number of elements in the second array:");
            n2 = scan.nextInt();
            System.out.println("Enter the elements of second array:");
            for(i=0 ; i<n2 ; i++)
            {
                b[i] = scan.nextInt();
            }
            for(i=0 ; i<n1+n2 ; i++)
            {
                for(j=0 ; j<n2 ; j++)
                {
                    if(a[i]==b[j])
                    {c[m] = a[i];
                    m=m+1;}
                    else
                    continue;
                }
            }
            System.out.println("The desired result is:");
            for(i=0 ; i<m ; i++)
            {
                System.out.print(c[i] + " ");
            }
        }
    }
    
}