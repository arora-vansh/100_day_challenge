import java.util.Scanner;
public class print_prime_number {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int range,a=0;
        System.out.print("Enter the range till you want to print prime number:");
        range = scan.nextInt();
        scan.close();
        System.out.println("The prime number are");
        for(int i = 1;i<=range;i++)
        {
            a=0;
            for(int j=1;j<=i;j++)
            {
                
                if(i%j==0)
                a=a+1;
            }
            if(a<=2)
            System.out.print(" "+i);
            else
            continue;
        }
    }
    
}
