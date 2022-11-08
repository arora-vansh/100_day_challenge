import java.util.Scanner;
public class check_start_of_string 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String s,start;
        int n=0;
        System.out.print("Enter the String:");
        s = scan.nextLine();
        char[] c1 = s.toCharArray();
        System.out.print("Enter the starting elements:");
        start  = scan.nextLine();
        scan.close();
        char[] c2 = start.toCharArray();
        for(int i=0 ; i<start.length() ; i++)
        {
            if(c1[i] == c2[i])
            n++;
        }
        if(n == start.length())
        System.out.print("True");
        else
        System.out.print("False");
    }
}
