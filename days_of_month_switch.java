import java.util.Scanner;
public class days_of_month_switch {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num;
        System.out.println("Enter the number for month:");
        num = scan.nextInt();
        scan.close();
        switch(num){
            case 1:
            System.out.println("Month is January and it contains 31 days");
            break;
            case 2:
            System.out.println("Month is February and it contains 28 days");
            break;
            case 3:
            System.out.println("Month is March and it contains 31 days");
            break;
            case 4:
            System.out.println("Month is April and it contains 30 days");
            break;
            case 5:
            System.out.println("Month is May and it contains 31 days");
            break;
            case 6:
            System.out.println("Month is June and it contains 30 days");
            break;
            case 7:
            System.out.println("Month is July and it contains 31 days");
            break;
            case 8:
            System.out.println("Month is August and it contains 31 days");
            break;
            case 9:
            System.out.println("Month is September and it contains 30 days");
            break;
            case 10:
            System.out.println("Month is October and it contains 31 days");
            break;
            case 11:
            System.out.println("Month is November and it contains 30 days");
            break;
            case 12:
            System.out.println("Month is December and it contains 31 days");
            break;
            default:
            System.out.println("Invalid Input");
        }
    }
    
}
