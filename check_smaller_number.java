import java.util.Scanner;
public class check_smaller_number {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num1,num2;
        System.out.println("Enter first number:");
        num1=scan.nextInt();
        System.out.println("Enter second number:");
        num2=scan.nextInt();
        scan.close();
        if (num1 > num2)
        System.out.println(num2 + " is smaller");
        else if(num2 > num1)
        System.out.println(num1 + " is smaller");
        else
        System.out.println("The entered numbers are equal");
    }
    
}
