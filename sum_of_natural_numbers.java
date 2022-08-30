import java.util.Scanner;
public class sum_of_natural_numbers {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n,sum=0;
        System.out.print("Enter the range till you want to determine the sum:");
        n = scan.nextInt();
        scan.close();
        for(int i=1 ; i<=n ; i++)
        {
            sum = sum + i;
        } 
        System.out.println("The result is " + sum);
    }
    
}
