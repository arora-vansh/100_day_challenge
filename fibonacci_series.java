import java.util.Scanner;
public class fibonacci_series {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num,i,a=0,b=1,c;
        System.out.print("Enter the number for the lenght of fibonacci series:");
        num = scan.nextInt();
        scan.close();
        System.out.print("Fibonacci series is: 0");
        for(i=0 ; i<=num ; i++)
        {
            c=b+a;
            a=b;
            b=c;
            System.out.print(" "+ b);
        }
    }
    
}
