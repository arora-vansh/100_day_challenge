import java.util.Scanner;
public class case_check {
    public static void main(String[] args){
        Scanner scan  = new Scanner(System.in);
        char ch;
        System.out.println("Enter the character:");
        ch=scan.next().charAt(0);
        if (ch >= 65 && ch <= 90)
        System.out.println("Given character is in Uppercase");
        else if (ch >= 97 && ch <= 122)
        System.out.println("Given character is in Lowercase");
        else if (ch >= 48 && ch <= 57)
        System.out.println("Given character is a number");
        else
        System.out.println("Given character is a special character");
        scan.close();
    }
}
