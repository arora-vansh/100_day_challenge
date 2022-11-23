import java.util.Scanner;
public class add_comma_after_each_string 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String s;
        System.out.print("Enter the String:");
        s = scan.nextLine();
        scan.close();
        for(String a : s.split(" "))
        {
            System.out.print(a + ", ");
        }
    }
}
