import java.util.Scanner;
public class remove_vowel {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String s;
        int m=0;
        System.out.println("Enter the String:");
        s = scan.nextLine();
        scan.close();
        for(int i=0 ; i<s.length() ; i++)
        {
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'
            || s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U')
            m = m + 1;
        }
        System.out.println("Total number of vowels in the string is " + m);
    }
    
}
