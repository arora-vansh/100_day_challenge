import java.util.Scanner;
public class comparing_two_string 
{
    public static void main(String[] args)
    {
        try(Scanner scan = new Scanner(System.in))
        {
            int n1,n2,a=0;
            String s1,s2;
            System.out.print("Enter first string:");
            s1 = scan.nextLine();
            System.out.print("Enter second string:");
            s2 = scan.nextLine();
            char[] ch1 = s1.toCharArray();
            char[] ch2 = s2.toCharArray();
            n1 = s1.length();
            n2 = s2.length();
            if(n1 != n2)
            System.out.print("The Strings are not same");
            else if(n1 == n2)
            {
                for(int i=0 ; i<n1 ; i++)
                {
                    if(ch1[i] == ch2[i])
                    a = a + 1;
                }
                if(a == n1)
                System.out.print("The input Strings are same");
                else
                System.out.print("The input Strings are not same");
            }
        }
    }   
}
