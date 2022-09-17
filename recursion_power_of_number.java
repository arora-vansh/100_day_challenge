import java.util.Scanner;
public class recursion_power_of_number {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n,pow;
        System.out.println("Enter the number:");
        n = scan.nextInt();
        System.out.println("Enter the power:");
        pow = scan.nextInt();
        scan.close();
        System.out.println("The result is " + cal(n,pow));
    }
    static int cal(int n , int pow){
        int res=1;
        if(pow == 1)
        return n;
        else
        {
            res = n * cal(n,pow-1);
        }
        return res;
    }
    
}
