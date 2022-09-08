import java.util.Scanner;
public class average_excluding_largest_smallest {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){
            int n,i,j,temp,s=0;
            int[] a = new int[20];
            float avg;
            System.out.println("Enter the total numbers of elements in the array:");
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
                        temp = a[i];
                        a[i]=a[j];
                        a[j]=temp;
                    }
                }
            }
            for(i=1 ; i<n-1 ; i++)
            {
                s = s + a[i];
            }
            avg = (float) (s / (n-2));
            System.out.println("The required average is " + avg);
        }
    }
    
}
