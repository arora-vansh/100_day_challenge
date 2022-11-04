import java.util.Scanner;
public class replace_character_in_string 
{
    public static void main(String[] args)
    {
    Scanner scan = new Scanner(System.in);
    String s;
    System.out.print("Enter the String:");
    s = scan.nextLine();
    char[] a = s.toCharArray();
    char o,n;
    System.out.print("Enter the character you want to replace:");
    o = scan.next().charAt(0);
    System.out.print("Enter the character that you want to enter:");
    n = scan.next().charAt(0);
    scan.close();
    for(int i = 0 ; i<s.length() ; i++)
    {
        if(a[i] == o)
        {
            a[i]=n;
        }
        else 
        continue;
    }
    System.out.print("The new String is ");
    for(int i=0 ; i<s.length() ; i++)
    System.out.print(a[i]);
    }
}
