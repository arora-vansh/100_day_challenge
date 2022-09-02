import java.util.Scanner;
public class average_function {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter first number:");
        a = scan.nextInt();
        System.out.println("Enter second number:");
        b = scan.nextInt();
        System.out.println("Enter third number:");
        c = scan.nextInt();
        scan.close();
        System.out.println("The average of three numbers is " + avg(a,b,c));
    }
    static int avg(int a, int b, int c)
    {
        return ((a+b+c)/3);
    }
    
}
