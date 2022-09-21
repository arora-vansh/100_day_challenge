import java.util.Scanner;
public class first_repeating_element_array {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){
            int n,i,j,m=0;
            int[] a = new int[20];
            int[] b = new int[20];
            System.out.println("Enter the total number of elements of the array:");
            n = scan.nextInt();
            System.out.println("Enter the elements of the array:");
            for(i=0 ; i<n ; i++)
            {
                a[i] = scan.nextInt();
                b[i]=a[i];
            }
            for(i=0 ; i<n ; i++)
            {
                for(j=i+1 ; j<n ; j++)
                {
                    if(a[i]==b[j])
                    m=a[i];
                    if(m!=0)
                    break;
                }
                if(m>=1)
                break;
            }
            if(m!=0)
            System.out.println("The first repeating element is " + m);
            else
            System.out.println("There is no repeating element");
        }
    }
    
}
