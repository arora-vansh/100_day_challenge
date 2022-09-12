import java.util.Scanner;
public class position_of_character {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String ch;
        char i;
        int n;
        System.out.println("Enter the String:");
        ch = scan.nextLine();
        System.out.println("Enter the index for the String:");
        n = scan.nextInt();
        scan.close();
        i =(char) ch.charAt(n);
        System.out.print("The Value at given string is " + i);
    }
    
}
