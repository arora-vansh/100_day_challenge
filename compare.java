import java.util.Scanner;
public class compare {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int no1,no2;
        System.out.println("Enter first number:");
        no1=scan.nextInt();
        System.out.println("Enter second number:");
        no2=scan.nextInt();
        if (no1 == no2)
        System.out.println("Entered numbers are same");
        else
        System.out.println("Entered numbers are not same");

    }
    
}
