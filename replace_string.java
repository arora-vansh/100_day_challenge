import java.util.Scanner;
public class replace_string {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String s,rep,word,n;
        System.out.println("Enter the String:");
        s = scan.nextLine();
        System.out.println("Enter the word you want to replace:");
        word = scan.nextLine();
        System.out.println("Enter the new word:");
        rep = scan.nextLine();
        scan.close(); 
        n = s.replaceAll(word,rep);
        System.out.println("The new String is:" + n);
    }
    
}
