import java.util.Scanner;
public class sum_function {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a,b;
        System.out.println("Enter first number:");
        a = scan.nextInt();
        System.out.println("Enter second number:");
        b = scan.nextInt();
        scan.close();
        sum(a,b);
        System.out.println("The sum of two numbers is " + sum(a,b));

    }
    static int sum(int a,int b)
    {
        return a + b;  
    }
}
