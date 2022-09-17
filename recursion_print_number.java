import java.util.Scanner;
public class recursion_print_number {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.println("Enter the range till you want to print the elements:");
        n = scan.nextInt();
        scan.close();
        System.out.print("The desired result is ");
        num(n,1);
    }
    static int num(int n, int i){
        if(i <= n)
        {
            System.out.print(i+" ");
            return(num(n,++i));
        }
        return 1;
    }
}
