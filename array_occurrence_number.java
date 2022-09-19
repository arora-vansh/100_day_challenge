import java.util.Scanner;
public class array_occurrence_number {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){
            int n,i,m,count=0;
            int[] a = new int[30];
            System.out.println("Enter the total number of elements of the array:");
            n = scan.nextInt();
            System.out.println("Enter the elements of the array:");
            for(i=0 ; i<n ; i++)
            {
                a[i] = scan.nextInt();
            }
            System.out.println("Enter the element you want to find the occurrence:");
            m = scan.nextInt();
            for(i=0 ; i<n ; i++)
            {
                if(a[i] == m)
                count = count+1;
            }
            System.out.println("The occurrence of the number " + m + " is " + count);
        }
    }
    
}
