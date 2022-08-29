import java.util.Scanner;
public class factorial {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num,i,fact=1;
        System.out.print("Enter the number whose factorial is to be calculated:");
        num = scan.nextInt();
        scan.close();
        for(i=num;i>0;i--)
        {
            fact = fact * i;
        }
        System.out.println("The factorial is "+ fact);

    }
    
}
