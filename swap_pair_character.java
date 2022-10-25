import java.util.Scanner;
public class swap_pair_character {
    public static void main(String[] args)
    {
        try(Scanner scan = new Scanner(System.in))
        {
            String s;
            System.out.print("Enter the string:");
            s = scan.nextLine();
            char[] ch = s.toCharArray();
            char temp;
            for(int i=0 ; i < s.length()-1 ; i=i+2)
            {
                temp = ch[i];
                ch[i] = ch[i+1];
                ch[i+1] = temp; 
            }
            System.out.print(ch);
        }
    }
}
