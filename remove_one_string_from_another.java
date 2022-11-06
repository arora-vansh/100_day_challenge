import java.util.Scanner;
public class remove_one_string_from_another 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String s1,s2;
        System.out.print("Enter the first string:");
        s1 = scan.nextLine();
        System.out.print("Enter the String that you want to remove:");
        s2 = scan.nextLine();
        scan.close();
        s1 = s1.replaceAll(s2, "");
        System.out.print("The desired output is " + s1);
    }
}
