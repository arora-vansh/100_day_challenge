import java.util.Scanner;
public class count_seroes_using_recursion {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.println("Enter the number:");
        n = scan.nextInt();
        scan.close();
        System.out.println("The total number of zeroes are: " + count(n));
    }
    static int count(int n)
    {
        int s;
        if(n==0)
        return 0;
        s = n % 10;
        if(s==0)
        return 1+count(n/10);
        return count(n/10);
    }
}
