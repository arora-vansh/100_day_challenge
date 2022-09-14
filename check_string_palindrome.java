import java.util.Scanner;
public class check_string_palindrome {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String os,ns="";
        char ch;
        System.out.println("Enter the String:");
        os = scan.nextLine();
        scan.close();
        for(int i=0 ; i<os.length() ; i++)
        {
            ch = os.charAt(i);
            ns = ch + ns;
        }
        if(os.equals(ns))
        {
        System.out.println("The given String is a palindrome");
        }
        else
        System.out.println("The given String is not a palindrome");
    }
    
}
