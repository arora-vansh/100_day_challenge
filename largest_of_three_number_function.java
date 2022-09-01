import java.util.Scanner;
public class largest_of_three_number_function {
    public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      int a,b,c;
      System.out.println("Enter first number:");
      a = scan.nextInt();
      System.out.println("Enter second number:");
      b = scan.nextInt();
      System.out.println("Enter third number:");
      c = scan.nextInt();
      scan.close();
      System.out.println("The largest number is " + large(a,b,c));
    }
    static int large(int a , int b , int c){
        if(a>b && a>c)
        return a;
        else if(b>a && b>c)
        return b;
        else
        return c;
    }
}
