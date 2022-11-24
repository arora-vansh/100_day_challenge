import java.util.Scanner;
public class add_comma_after_each_string 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String b;
        System.out.print("Enter the String:");
        b = scan.nextLine();
        scan.close();
        for(String a : b.split(" "))
        {
            System.out.print(b + ", ");
        }
    }
}
