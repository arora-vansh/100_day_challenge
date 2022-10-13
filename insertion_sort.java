import java.util.Scanner;
public class insertion_sort {
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
        sort_insertion(a,n);
    }
    }
    static int sort_insertion(int a[] , int n)
    {
        int i,j,temp;
        for(i=1 ; i<n ; i++)
        {
            temp = a[i];
            j=i-1;
            while(j>=0 && a[j]>temp)
            {
                a[j+1] = a[j];
                j=j-1;
            }
            a[j+1]=temp;
        }
        for(i=0 ; i<n ; i++)
        {
            System.out.print(a[i] + " ");
        }
        return 0;
    }
}
