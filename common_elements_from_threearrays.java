import java.util.Scanner;
public class common_elements_from_threearrays {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){
            int n,i,j,k;
            int[] a = new int[20];
            int[] b = new int[20];
            int[] c = new int[20];
            System.out.println("Enter the total numbers of elements in the array:");
            n = scan.nextInt();
            System.out.println("Enter the elements of first array:");
            for(i=0 ; i<n ; i++)
            {
                a[i] = scan.nextInt();
            }
            System.out.println("Enter the elements of second array:");
            for(i=0 ; i<n ; i++)
            {
                b[i] = scan.nextInt();
            }
            System.out.println("Enter the elements of third array:");
            for(i=0 ; i<n ; i++)
            {
                c[i] = scan.nextInt();
            }
            System.out.print("The common numbers in the array are:");
            for(i=0 ; i<n ; i++)
            {
                for(j=0 ; j<n ; j++)
                {
                    for(k=0 ; k<n ; k++)
                    {
                        if(a[i] == b[j] && b[j] == c[k])
                        System.out.println("" + a[i]);
                    }
                }
            }
        }
    }
    
}
