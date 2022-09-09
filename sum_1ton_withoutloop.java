import java.util.Scanner;
public class sum_1ton_withoutloop {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.println("Enter the range:");
        n = scan.nextInt();
        System.out.println("The sum of number is " + sum(n));
        scan.close();
    }
    static int sum(int n)
    {
        if(n<1)
        return 0;
        int i=0;
        i = n + sum(n-1);
        return i;
    }
    
}
