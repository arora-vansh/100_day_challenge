import java.util.Scanner;
public class sum_of_digits_function {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.println("Enter the number:");
        n = scan.nextInt();
        scan.close();
        System.out.println("Sum of digits: " + sum(n));
    }
    static int sum(int n)
    {
        int temp,a,sum=0;
        temp = n;
        while(temp>0)
        {
            a = temp % 10;
            sum = sum +a;
            temp = temp / 10;
        }
        return sum;
    }
    
}
