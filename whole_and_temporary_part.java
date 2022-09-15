import java.util.Scanner;
public class whole_and_temporary_part {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double n,fr,in;
        System.out.println("Enter a whole number:");
        n = scan.nextDouble();
        scan.close();
        in = n - (n % 1);
        fr = n % 1;
        System.out.print("The whole number is " + in);
        System.out.print("\n The fractional number is " + fr);
    }
    
}
