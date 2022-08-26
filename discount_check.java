import java.util.Scanner;
public class discount_check {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a,unit;
        float amt;
        System.out.println("Enter numbers of units:");
        unit = scan.nextInt();
        scan.close();
        if(unit >= 10)
        {
            a = unit * 100;
            amt = (float) (a - (0.1 * a));
            System.out.println("Total amount after 10% discount is "+ amt);
        }
        else
        System.out.println("Total amount is " + unit*100);
    }
}

