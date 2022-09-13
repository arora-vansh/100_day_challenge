import java.util.Scanner;
public class length_of_string {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String s;
        System.out.println("Enter the String:");
        s = scan.nextLine();
        scan.close();
        System.out.println("The length of String is " + s.length());
    }
    
}
