import java.util.Scanner;
public class maximum_of_three_numbers {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num1,num2,num3;
        System.out.println("Enter first number:");
        num1 = scan.nextInt();
        System.out.println("Enter second number:");
        num2 = scan.nextInt();
        System.out.println("Enter third number:");
        num3 = scan.nextInt();
        scan.close();
        if(num1 > num2)
        {
            if(num1 > num3)
            System.out.println(num1 + " is largest");
            else
            System.out.println(num3 + " is largest");
        }
        else if(num2 > num1)
        {
            if(num2 > num3)
            System.out.println(num2 + " is largest");
            else
            System.out.println(num3 + " is largest");
        }

    }
    
}

