import java.util.Scanner;
public class array_check
{
	public static void main(String[] args) {
	    try(Scanner scan = new Scanner(System.in)){
	     int n,i;
	     int[] a = new int[50];
	     System.out.print("Enter the size of the array:");
	     n = scan.nextInt();
	     System.out.print("Enter the elements of the array:");
	     for(i=0 ; i<n ; i++)
	     {
	         a[i] = scan.nextInt(); 
	     }
	     if(check(a,n)==0)
	     System.out.print("The array does not contains 65 or 73");
	     else
	     System.out.print("The array contains 65 or 73");
	    }
	}
	static int check(int a[], int n)
	{
	    int i,s=0;
	    for(i=0 ; i<n ; i++)
	    {
	        if(a[i]==65 || a[i]==73)
	        s++;
	    }
	    if(s>0)
	    return 1;
	    else
	    return 0;
	}
}