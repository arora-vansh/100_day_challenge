import java.util.Scanner;
public class recursion_check_number {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){
            int n,i,num;
            int[] a = new int[20];
            System.out.println("Enter the total number of elements in the array:");
            n = scan.nextInt();
            System.out.println("Enter the elements of the array:");
            for(i=0 ; i<n ; i++)
            {
                a[i] = scan.nextInt();
            }
            System.out.println("Enter the element you want to search:");
            num = scan.nextInt();
            int index = search(num,a.length,0,a);
            if (index != -1)
           System.out.println("Element " + n + " is present at index " + index);
        else
            System.out.println("Element " + n + " is not present");
        }
        }
    
        static int search(int n, int lt, int ft, int a[])
        {
            
          if (lt < ft)
          return -1;
       if (a[ft] == n)
          return ft;
       if (a[lt] == n)
          return lt;
       return search(n, ft-1, lt-1, a);
    }
    
}
