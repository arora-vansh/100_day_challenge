import java.util.Scanner;
public class convert_to_uppercase {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String s,us;
        System.out.println("Enter the Stirng:");
        s = scan.nextLine();
        scan.close();
        us = s.toUpperCase();
        System.out.println("The String in Upper Case is: " + us);
    }
    
}
