import java.util.Scanner;
public class difference_between_largest_smallest {
    public static void main(String[] args){
        try (Scanner scan = new Scanner(System.in)){
            int n,i,j,temp,diff;
            int[] a = new int[20];
            System.out.println("Enter the total number of elements in the array:");
            n = scan.nextInt();
            System.out.println("Enter the elements in the array:");
            for(i=0 ; i<n ; i++)
            {
                a[i]=scan.nextInt();
            }
            for(i=0 ; i<n ; i++)
            {
                for(j=i+1 ; j<n ; j++)
                {
                    if(a[j]>a[i])
                    {
                        temp=a[i];
                        a[i]=a[j];
                        a[j]=temp;
                    }
                }
            }
            diff = a[0]-a[n-1];
            System.out.println("The difference between largest and smallest number is " + diff);
        }
    }
    
}
