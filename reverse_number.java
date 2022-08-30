import java.util.Scanner;
public class reverse_number {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num,temp,rev=0,a;
        System.out.print("Enter a number:");
        num = scan.nextInt();
        scan.close();
        temp = num;
        while(temp>0)
        {
            a = temp % 10;
            rev = rev * 10 + a;
            temp = temp / 10;
        }
        System.out.println("The reverse of the number is " + rev);
    }
    
}
