import java.util.Scanner;
public class convert_to_lowercase {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String s,ls;
        System.out.println("Enter the String:");
        s = scan.nextLine();
        ls = s.toLowerCase();
        scan.close();
        System.out.println("The String in Lower Case is:" + ls);
    }
    
}
