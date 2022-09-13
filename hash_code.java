import java.util.Scanner;
public class hash_code {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String s;
        int code;
        System.out.println("Enter the String:");
        s = scan.nextLine();
        scan.close();
        code = s.hashCode();
        System.out.println("The unique HashCode is " + code);
    }
    
}
