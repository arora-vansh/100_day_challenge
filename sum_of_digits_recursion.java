import java.util.Scanner;
public class sum_of_digits_recursion {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.println("Enter the number:");
        n = scan.nextInt();
        scan.close();
        System.out.print("The sum of digits is " + sum(n));
    }
    static int sum(int n)
    {
        if(n == 0)
        return 0;
        return n = (n % 10 + sum(n/10));
    }
    
}
