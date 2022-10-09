import java.util.Scanner;
public class merge_two_sorted_array {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){
            int n,m,i,j,temp;
            int[] a = new int[50];
            int[] b = new int[50];
            int[] c = new int[100];
            System.out.println("Enter the number of elements in the first array:");
            n = scan.nextInt();
            System.out.println("Enter the elements in first array:");
            for(i=0 ; i<n ; i++)
            {
                a[i] = scan.nextInt();
            }
            System.out.println("Enter the total number of elements in the second array:");
            m = scan.nextInt();
            System.out.println("Enter the elements of second array:");
            for(i=0 ; i<m ; i++)
            {
                b[i] = scan.nextInt();
            }
            for(i=0 ; i<n ; i++)
            {
                c[i] = a[i];
            }
            for(i=0 ; i<m ; i++)
            {
                c[n+i] = b[i];
            }
            for(i=0 ; i<n+m ; i++)
            {
                for(j=i+1 ; j<n+m ; j++)
                {
                    if(c[i]>c[j])
                    {
                        temp = c[i];
                        c[i] = c[j];
                        c[j] = temp;
                    }
                }
            }
            System.out.println("The merged array is:");
            for(i=0 ; i<(n+m) ; i++)
            {
                System.out.print(c[i] + " ");
            }
        }
    }
}
