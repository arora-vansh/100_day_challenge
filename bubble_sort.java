import java.util.Scanner;
public class bubble_sort {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){
            int n,i;
            int[] a = new int[50];
            System.out.println("Enter the number of elemets in the array:");
            n = scan.nextInt();
            System.out.println("Enter the elements of the array:");
            for(i=0 ; i<n ; i++)
            {
                a[i] = scan.nextInt();
            }
            System.out.print("The sorted array is ");
            Sort_Bubble(a,n);
        }
    }
    static int Sort_Bubble(int a[] , int n)
    {
        int temp,i,j;
        for(i=0 ; i<n ; i++)
        {
            for(j=0 ; j<n-i-1 ; j++)
            {
                if(a[j]>a[j+1])
                {
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        for(i=0 ; i<n ; i++)
        {
            System.out.print(a[i] + " ");
        }
        return 0;
    }
    
}
