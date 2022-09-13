import java.util.Scanner;
public class concanate_String {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String s1,s2,s3;
        System.out.println("Enter the first String:");
        s1 = scan.nextLine();
        System.out.println("Enter the second String:");
        s2 = scan.nextLine();
        scan.close();
        s3 = s1.concat(s2);
        System.out.println("The concated String is " + s3);
    }
    
}
