import java.util.Scanner;
public class simple_calculator {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n1,n2,choice;
        float result;
        System.out.println("Enter first number:");
        n1 = scan.nextInt();
        System.out.println("Enter second number:");
        n2 = scan.nextInt();
        System.out.println("Enter your choice:");
        System.out.println("1 : Addition");
        System.out.println("2 : Subtraction");
        System.out.println("3 : Multiplication");
        System.out.println("4 : Division");
        System.out.println("5 : Remainder");
        choice = scan.nextInt();
        scan.close();
        switch(choice){
            case 1:
            result = n1 + n2;
            System.out.println("The result is " + result);
            break;
            case 2:
            result = n1 - n2;
            System.out.println("The result is " + result);
            break;
            case 3:
            result = n1 * n2;
            System.out.println("The result is " + result);
            break;
            case 4:
            result = (float) (n1) / (float) (n2);
            System.out.println("The result is " + result);
            break;
            case 5:
            result = (float) (n1) % (float) (n2);
            System.out.println("The result is " + result);
            break;
            default:
            System.out.println("Invalid Input");
        }

    }
    
}
