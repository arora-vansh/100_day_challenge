import java.util.Scanner;
public class count_numeric_in_string 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String s;
        int n=0;
        System.out.print("Enter the String:");
        s = scan.nextLine();
        char[] ch = s.toCharArray();
        scan.close();
        for(int i=0 ; i<s.length() ; i++)
        {
            if(ch[i] >= '0' && ch[i] <= '9')
            n++;
        }
        System.out.print("Count of Digits in the entered string are " + n);
    }
}
