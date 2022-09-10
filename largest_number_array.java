import java.util.Scanner;
public class largest_number_array
{
	public static void main(String[] args) {
	    try(Scanner scan = new Scanner(System.in)){
		int n,i,j,temp,lar=0;
		int[] a = new int[20];
		System.out.print("Enter the total number of elements present in the array:");
		n = scan.nextInt();
		System.out.print("Enter the elements in the array:");
		for(i=0 ; i<n ; i++)
		{
		    a[i] = scan.nextInt();
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
		for(i=0 ; i<n ; i++)
		{
		    lar = (lar*10) + a[i];
		}
		System.out.print("Largest possible nunber is:" + lar);
	}
	}
}