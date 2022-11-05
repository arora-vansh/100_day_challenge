import java.util.Scanner;
public class insert_one_string_to_another 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String s,n;
        int in;
        System.out.print("Enter the String:");
        s = scan.nextLine();
        System.out.print("Enter the String that you want to insert:");
        n = scan.nextLine();
        System.out.print("Enter the index at which you want to insert the String:");
        in = scan.nextInt();
        scan.close();
        char[] a = s.toCharArray();
        for(int i=0 ; i<s.length() ; i++)
        {
            System.out.print(a[i]);
            if(i == in)
            System.out.print(n);
        }
    }
}
