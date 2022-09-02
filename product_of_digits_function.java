import java.util.Scanner;
public class product_of_digits_function {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.println("Enter the number:");
        n = scan.nextInt();
        scan.close();
        System.out.println("Product of the digits: " + pro(n));
    }
    static int pro(int n)
    {
        int temp,a,pro=1;
        temp = n;
        while(temp>0)
        {
            a = temp % 10;
            pro = pro * a;
            temp = temp / 10;
        }
        return pro;
    }
    
}
