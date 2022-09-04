import java.util.Scanner;
public class extract_first_digit_function {
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n;
    System.out.println("Enter the number:");
    n = scan.nextInt();
    scan.close();
    System.out.println("" + first(n)); 
    }
    static int first(int n)
    {
        int temp;
        temp = n;
        while(temp >= 10)
        {
            temp = temp / 10;
        }
        return temp;
    }
    
}
