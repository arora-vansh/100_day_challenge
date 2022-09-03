import java.util.Scanner;
public class password_check {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a password which satisfies the following conditions:");
        System.out.print("1. The password should contain minimum of eight letters. \n" +
        "2. The password must contain letters and digits only. \n" +
        "3. There must contain at least two digits. \n");
        String s = scan.nextLine();
        scan.close();
        if(password(s))
        System.out.print("The entered password is valid.");
        else
        System.out.print("The entered password is invalid.");
    }
    static boolean password(String s)
    {

        if(s.length()<8)
        return false;
        int c=0,n=0;
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (num(ch)) 
            n=n+1;
            else if (let(ch)) 
            c=c+1;
            else 
            return false;
        }


        return (c>=2 && n>=2);
    }
    public static boolean let(char ch) {
        ch = Character.toUpperCase(ch);
        return (ch>='A' && ch<='Z');
        
    }
    public static boolean num(char ch) {

        return (ch>= '0' && ch <='9');
    }
}
    

