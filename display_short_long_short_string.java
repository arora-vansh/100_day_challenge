import java.util.Scanner;
public class display_short_long_short_string {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String s1,s2;
        System.out.println("Enter the first string:");
        s1 = scan.nextLine();
        System.out.println("Enter the second string:");
        s2 = scan.nextLine();
        scan.close();
        if(s1.length()>s2.length())
        System.out.print("The desired string is " + s2 + s1 + s2);
        else
        System.out.print("The desired string is " + s1 + s2 + s1);
    }
    
}
