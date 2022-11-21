import java.util.Scanner;
public class print_even_odd_length_string 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String s;
        System.out.print("Enter the String:");
        s = scan.nextLine();
        scan.close();
        System.out.print("The even length words are ");
        for(String word : s.split(" "))
        {
            if(word.length() % 2 == 0)
            System.out.print(word + " ");
        } 
        System.out.print("\nThe odd length words are ");
        for(String word : s.split(" "))
        {
            if(word.length() % 2 != 0)
            System.out.print(word + " ");
        }
    } 
}
