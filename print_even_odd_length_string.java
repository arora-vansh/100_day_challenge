import java.util.Scanner;
public class print_even_odd_length_string 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String s;
        String[] word;
        System.out.print("Enter the String:");
        s = scan.nextLine();
        scan.close();
        word = s.split(" ");
        System.out.print("The even length words are ");
        for(int i=0 ; i<s.length() ; i++)
        {
            if(word.length % 2 == 0)
            System.out.print(word);
        } 
        System.out.print("The odd length words are ");
        for(int i=0 ; i<s.length() ; i++)
        {
            if(word.length % 2 != 0)
            System.out.print(word);
        }
    } 
}
