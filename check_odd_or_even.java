import java.util.Scanner;
public class check_odd_or_even {
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        int num;
        System.out.println("Enter the number:");
        num=scan.nextInt();
        scan.close();
        if (num % 2 == 0)
        System.out.println("Given number is even");
        else
        System.out.println("Given number is odd");
    }


    
}
