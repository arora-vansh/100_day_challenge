import java.util.Scanner;
public class decimal_to_binary {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.println("Enter the number:");
        n = scan.nextInt();
        scan.close();
        System.out.println("The number in binary is ");
        bin(n);
    }
    static int bin(int n)
    {
        int[] a = new int[100];
        int i=0,j;
        while(n>0)
        {
            a[i] = n % 2;
            n = n / 2;
            i++;
        }
        for (j = i - 1; j >= 0; j--) 
        {System.out.print(a[j]);
        }
        return 0;
    }
}
