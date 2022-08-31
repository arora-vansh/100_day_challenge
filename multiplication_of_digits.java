import java.util.Scanner;
public class multiplication_of_digits {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num,temp,a,mul=1;
        System.out.print("Enter the number:");
        num = scan.nextInt();
        scan.close();
        temp = num;
        while(temp > 0)
        {
            a = temp % 10;
            mul = mul * a;
            temp = temp / 10;
        }
        System.out.println("The multiplication of digits is " + mul);
    }
    
}
