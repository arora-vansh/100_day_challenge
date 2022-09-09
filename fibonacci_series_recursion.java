import java.util.Scanner;
public class fibonacci_series_recursion {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n,i;
        System.out.println("Enter the number of times you want to print the series:");
        n = scan.nextInt();
        scan.close();
        System.out.print("The fibonacci series is");
        for(i=0 ; i<n ; i++){
        System.out.print(" " + fib(i));
    }
}
    static int fib(int n){
        if(n<=1)
        return n;
        return fib(n-1) + fib(n-2);
    }
    
}
