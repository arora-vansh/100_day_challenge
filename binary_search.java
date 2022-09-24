import java.util.Scanner;
public class binary_search {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){
        int n,i,num;
        int[] a = new int[30];
        System.out.println("Enter the total number of elements in the array:");
        n = scan.nextInt();
        System.out.println("Enter the elements of array:");
        for(i=0 ; i<n ; i++)
        {
            a[i] = scan.nextInt();
        }
        System.out.println("Enter the element that you want to search:");
        num = scan.nextInt();
        int index = Search(a, num);
        if(index != -1){
        System.out.println("The number is available at index " + index);
        }
        else
        {
            System.out.println("Element is not present");
        }    
    }
    }
    static int Search(int[] a, int s){
        int ft=0,lt=a.length-1,mid;
        while(ft<=lt){
            mid = (ft+lt)/2;
            if(s==a[mid])
            return mid;
            else if(mid<a[mid])
            {
            lt=mid-1;
            }
            else
            {ft=mid+1;
            }
        }
        return -1;
    }
}
