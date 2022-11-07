import java.util.Scanner;
public class check_end_of_string 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String s,end;
        int n=0;
        System.out.print("Enter the String:");
        s = scan.nextLine();
        char[] c1 = s.toCharArray();
        System.out.print("Enter the ending part:");
        end = scan.nextLine();
        scan.close();
        char[] c2 = end.toCharArray();
        for(int i=0 ; i<end.length() ; i++)
        {
            if(c1[s.length()-end.length()+i] == c2[i])
            n++;
        }
        if(n == end.length())
        System.out.print("True");
        else
        System.out.print("False");
    }
}
