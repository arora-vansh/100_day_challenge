import java.util.Scanner;
public class check_function {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.println("Enter a number: ");
        n = scan.nextInt();
        scan.close();
        System.out.println("Is every digit even: " + check(n));
    }
    static boolean check(int n){
        int temp;
            temp = n;
            while(temp>=0)
            {
                if(temp % 2 != 0)
                {
                    return false;

                }
                else
                {
                temp = temp/10;
                }
            if(temp == 0)
            return true;
            }
return true;    }
    }
    

