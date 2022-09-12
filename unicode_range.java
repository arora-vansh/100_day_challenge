import java.util.Scanner;
public class unicode_range {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String s;
        int n,r;
        System.out.println("Enter the String:");
        s = scan.nextLine();
        System.out.println("Enter the range:");
        n = scan.nextInt();
        scan.close();
        r = s.codePointCount(1, n);
        System.out.println("The code Point Count is " + r);

    }
    
}