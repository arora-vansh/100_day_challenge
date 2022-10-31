import java.util.Scanner;
public class maximum_occurance_in_string 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String s;
        int i,j,max=0;
        System.out.print("Enter the string:");
        s = scan.nextLine();
        int[] f = new int[s.length()];
        scan.close();
        char cm = s.charAt(0);
        char str[] = s.toCharArray();
        for(i=0 ; i<s.length() ; i++)
        {
            f[i] = 1;
            for(j=i+1 ; j<s.length() ; j++)
            {
                if(str[i] == str[j] && str[i] != ' ' && str[i] != '0')
                {
                    f[i]++;
                    str[j] = '0';
                }
            }
        }
        for(i=0 ; i<f.length ; i++)
        {
            if(max < f[i])
            {
                max = f[i];
                cm = str[i];
            }
        }
        System.out.print("The maximum occuring character is " + cm + " and its occurance is " + max);
    }
}
