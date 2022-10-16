import java.util.Scanner;
public class selection_sort {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){
            int n,i;
            int[] a = new int[50];
            System.out.println("Enter the number of elements in the array:");
            n = scan.nextInt();
            System.out.println("Enter the elements of the array:");
            for(i=0 ; i<n ; i++)
            {
                a[i] = scan.nextInt();
            }
            System.out.print("The sorted array is ");
            sort_selection(n,a);
        }
    }
    static int sort_selection(int n,int a[])
    {
        int temp,i,j,min;
        for(i=0 ; i<n ; i++)
        {
            min = i;
            for(j=i+1 ; j<n ; j++)
            {
                if(a[j]<a[min])
                min=j;
            }
            temp = a[min];
            a[min] = a[i];
            a[i] = temp;
        }
        for(i=0 ; i<n ; i++)
        {
            System.out.print(a[i] + " ");
        }
        return 0;
    }
    
}
