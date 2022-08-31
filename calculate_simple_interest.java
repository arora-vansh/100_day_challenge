import java.util.Scanner;
public class calculate_simple_interest {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int p,r,t,si;
        System.out.println("Enter principle amount:");
        p = scan.nextInt();
        System.out.println("Enter rate:");
        r = scan.nextInt();
        System.out.println(("Enter time in years:"));
        t = scan.nextInt();
        scan.close();
        si = (p*r*t)/100;
        System.out.println("The simple interest is " + si);
    }
    
}
