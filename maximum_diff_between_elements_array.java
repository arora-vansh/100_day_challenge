import java.util.Scanner;
public class maximum_diff_between_elements_array {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){
        int n,i,s;
        int[] a = new int[50];
        System.out.println("Enter the total number of elements of the array:");
        n = scan.nextInt();
        System.out.println("Enter the number of elements of the array:");
        for(i=0 ; i<n ; i++)
        {
            a[i] = scan.nextInt();
        }
        s = max(n,a) - min(n,a);
        System.out.println("The maximum difference in the array is: " + s);
    }
}
static int max(int n ,int a[])
{
    int i,j,temp;
    for(i=0 ; i<n ; i++)
    {
        for(j=i+1 ; j<n ; j++)
        {
            if(a[i]<a[j])
            {
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
    }
    return a[0];
}
static int min(int n ,int a[])
{
    int i,j,temp;
    for(i=0 ; i<n ; i++)
    {
        for(j=i+1 ; j<n ; j++)
        {
            if(a[i]>a[j])
            {
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
    }
    return a[0];
}
}
