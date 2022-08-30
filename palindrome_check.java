import java.util.Scanner;
public class palindrome_check {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num,rev=0,temp,a;
        System.out.print("Enter the number: ");
        num = scan.nextInt();
        scan.close();
        temp = num;
        while(temp > 0)
        {
            a = temp % 10;
            rev = rev * 10 + a;
            temp = temp / 10;
        }
        if(rev == num)
            System.out.print("The given number is a palindrome");
        else
        System.out.print("The given number is not a palindrome");
    }
    
}
