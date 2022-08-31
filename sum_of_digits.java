import java.util.Scanner;
public class sum_of_digits {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num,temp,a,sum=0;
        System.out.print("Enter the number:");
        num = scan.nextInt();
        scan.close();
        temp = num;
        while(temp>0)
        {
            a = temp % 10;
            sum = sum +a;
            temp = temp / 10;
        }
        System.out.println("The sum of digits is " + sum);
    }
    
}
