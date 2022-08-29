import java.util.Scanner;
public class prime_or_not {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num,i,a=0;
        System.out.print("Enter the number:");
        num = scan.nextInt();
        scan.close();
        for(i=1;i<=num;i++)
        {
            if(num % i == 0)
            {
                a=a+1;
            }
        }
        if(a>2)
        {
            System.out.println("The given number is not a prime number");
        }
        else
        System.out.println("The given number is a prime number");
    }
    
}
