import java.util.Scanner;
public class salary {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int sal,year;
        float bonus;
        System.out.println("Enter your salary:");
        sal = scan.nextInt();
        System.out.println("Enter years of service:");
        year = scan.nextInt();
        scan.close();
        if(year >= 5)
        {
            bonus = (float) (0.05 * sal);
            System.out.println("The bonus is " + bonus);
        } 
        else
        {
            System.out.println("No bonus");
        }
    }
    
}
