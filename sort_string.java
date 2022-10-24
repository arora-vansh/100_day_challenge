import java.util.Scanner;
public class sort_string 
{
    public static void main(String[] args)
    {
        try(Scanner scan = new Scanner(System.in))
        {
            String s;
            System.out.print("Enter the String:");
            s = scan.nextLine();
            char ch[] = s.toCharArray();
            char temp;
            int i=0,j;
            while(i<ch.length)
            {
                j=i+1;
                while(j<ch.length)
                {
                    if(ch[j]<ch[i])
                    {
                        temp = ch[i];
                        ch[i] = ch[j];
                        ch[j] = temp;
                    }
                    j = j + 1;
                }
                i = i + 1;
            }
            System.out.print(ch);
        }
    }    
}
