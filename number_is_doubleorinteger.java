import java.util.Scanner;
public class number_is_doubleorinteger {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double n;
        System.out.println("Enter the number:");
        n = scan.nextDouble();
        scan.close();
        if(n % 1 == 0)
        System.out.println("The given number is in integer");
        else
        System.out.println("The given number is in double");
    }
    
}
