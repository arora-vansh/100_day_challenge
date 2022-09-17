import java.util.Scanner;
public class recursion_number_of_digits {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.println("Enter a number:");
        n = scan.nextInt();
        scan.close();
        System.out.println("The sum of digits is:" + sum(n));
    }
    static int sum(int n){
        if(n == 0)
        return 0;
        else
        return (n%10 + sum(n/10));
    }
    
}
