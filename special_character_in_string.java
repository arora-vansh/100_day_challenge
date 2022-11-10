import java.util.Scanner;
public class special_character_in_string 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String s,sp;
        int n=0;
        System.out.print("Enter the String: ");
        s = scan.nextLine();
        char[] c1 = s.toCharArray();
        scan.close();
        sp = "!@#$%^&*()-_=+{}[]:;',.<|>/?";
        char[] c2 = sp.toCharArray();
        for(int i=0 ; i<s.length() ; i++)
        {
            for(int j=0 ; j<sp.length() ; j++)
            {
                if(c1[i] == c2[j])
                n++;
            }
        }
        System.out.print("The number of special characters are " + n);
    }
}
