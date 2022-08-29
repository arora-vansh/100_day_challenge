import java.util.Scanner;
public class power_of_the_number {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int i,num,pow,res=1;
        System.out.print("Enter the number: ");
        num = scan.nextInt();
        System.out.print("Enter the power: ");
        pow = scan.nextInt();
        scan.close();
        res=num;
        for(i=1;i<pow;i++)
        {
            res = res * num;
        }
        System.out.println("The result is "+ res);

    }
    
}
