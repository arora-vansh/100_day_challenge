import java.util.Scanner;
public class factos_of_three_function {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.println("Enter the number: ");
        n = scan.nextInt();
        scan.close();
        System.out.println(fact(n) + "");
    }
    static int fact(int n){
        int temp;
        temp = n;
        while(temp % 3 == 0)
        {
            System.out.print("3 * ");
            temp = temp / 3;
        }
        return temp;
    }    
}
