import java.util.Scanner;
public class binary_to_decimal {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n,s;
        System.out.println("Enter the binary number:");
        n = scan.nextInt();
        scan.close();
        s = decimal(n);
        System.out.println("The value in decimal is: " + s);
    }
    static int decimal(long n)
    {
        int i=0,num=0;
        long r;
        while(n != 0)
        {
            r = n % 10;
            n /= 10;
            num += r * Math.pow(2, i);
            ++i;
        }
        return num;
    }
    
}
