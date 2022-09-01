import java.util.Scanner;
public class factorial_function {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.println("Enter the number whose factorial is to be determined: ");
        n = scan.nextInt();
        scan.close();
        System.out.println("The factorial of number is " + fact(n));
    }
    static int fact(int n){
        if(n == 0)
        return 1;
        else
        return(n * fact(n-1));
    }
}
