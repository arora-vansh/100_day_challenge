import java.util.Scanner;
public class difference_between_string 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n1,n2,dif;
        String s1,s2;
        System.out.print("Enter the first string:");
        s1 = scan.nextLine();
        System.out.print("Enter the second string:");
        s2 = scan.nextLine();
        scan.close();
        n1 = s1.length();
        n2 = s2.length();
        if(n1 == n2)
        System.out.print("The length of both the string are same");
        else if(n1 > n2)
        {
            dif = n1 - n2;
            System.out.print("The first string is longer by " + dif);
        }
        else if(n2 > n1)
        {
            dif = n2 - n1;
            System.out.print("The second string is longer by " + dif);
        }
    }    
}
