import java.util.Scanner;
public class print_in_next_line 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String s;
        System.out.print("Enter the string:");
        s = scan.nextLine();
        scan.close();
        char[] a = s.toCharArray();
        for(int i=0 ; i<s.length() ; i++)
        {
            System.out.print(a[i]);
            if(a[i] == ' ')
            System.out.print("\n");
        }
    }
}
