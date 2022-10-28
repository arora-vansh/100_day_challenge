import java.util.Scanner;
public class remove_zeroes_till_other_number 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n,temp,s=0,a=0;
        System.out.print("Enter the number:");
        n = scan.nextInt();
        scan.close();
        while(n>0)
        {
            temp = n % 10;
            a = (a * 10) + temp;
            n = n / 10;
        }
        while(a>0)
        {
            temp = a % 10;
            s = (s * 10) + temp;
            a = a / 10;
        }
        System.out.print(s);
    }    
}
