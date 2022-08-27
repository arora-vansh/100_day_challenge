import java.util.Scanner;
public class check_leap_year {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int year;
        System.out.println("Enter the year:");
        year = scan.nextInt();
        scan.close();
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0) )
        System.out.println(year + " is a leap year");
        else
        System.out.println(year + " is not a leap year");
    }
    
}
