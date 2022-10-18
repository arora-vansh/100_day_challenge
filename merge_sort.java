import java.util.Scanner;
public class merge_sort {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){
            int n,i;
            int[] a = new int[50];
            System.out.print("Enter the number of elements of the array:");
            n = scan.nextInt();
            System.out.print("Enter the elements in the array:");
            for(i=0 ; i<n ; i++)
            {
                a[i] = scan.nextInt();
            }
            sort(a, 0, n-1);
            System.out.print("The sorted array is ");
            for(i=0 ; i<n ; i++)
            System.out.print(a[i] + " ");
        }
    }
    static int sort(int a[],int f,int l)
    {
        if(f<l)
        {
            int m = (f + l-1)/2;
            sort(a,f,m);
            System.out.print("1 ");
            sort(a,m+1,l);
            System.out.print("1 ");
            merge(a,f,m,l);
        }

        return 0;
    }
    static int merge(int a[], int f, int m, int l)
    {
        int n1,n2,i=0,j=0,k=0;
        System.out.print("2 ");
        n1 = m - f + 1;
        n2 = l - m;

        int[] a1 = new int[n1];
        int[] a2 = new int[n2];


        for(i=0 ; i<n1 ; i++)
        a1[i] = a[f+i];

        for(j=0 ; j<n2 ; j++)
        a2[j] = a[m+1+j];

        while(i<n1 && j<n2)
        {
            if(a1[i]<a2[j])
            {
                a[k] = a[i];
                i++;
            }
            else
            {
                a[k] = a[j];
                j++;
            }
            k++;
        }

        while(i < n1)
        {
            a[k] = a1[i];
            i++;
            k++;
        }

        while (j < n2) 
        {
            a[k] = a2[j];
            j++;
            k++;
        }
        return 0;
    }
    
}

/*76 58 34 95 03 24 15 */