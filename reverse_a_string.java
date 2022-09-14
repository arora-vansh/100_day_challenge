import java.util.Scanner;
public class reverse_a_string {
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
        System.out.println("String after reversal is " + ns);
    }
    
}
