import java.util.Scanner;
public class check_neon_number 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.print("Enter the number:");
        n = scan.nextInt();
        scan.close();
        if(neon(n)==0)
        System.out.print("The number is not a neon number");
        else
        System.out.print("The number is a neon number");
    }
    static int neon(int n)
    {
        int temp,num,s=0;
        num = n * n;
        while(num>0)
        {
            temp = num % 10;
            s = s + temp;
            num = num / 10;
        }
        if(s==n)
        return 1;
        return 0;
    }
}
