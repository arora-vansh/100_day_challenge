import java.util.Scanner;
public class compare_string {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String s1,s2;
        System.out.println("Enter the first String:");
        s1 = scan.nextLine();
        System.out.println("Enter the second String:");
        s2 = scan.nextLine();
        scan.close();
        if(s1.equals(s2))
        {
            System.out.println("Two Strings are same");
        }
        else
        System.out.println("Two String are not same");
    }
    
}
