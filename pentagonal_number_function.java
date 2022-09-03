import java.util.Scanner;
public class pentagonal_number_function {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.println("Enter the total numbers of pentagonal numbers:");
        n = scan.nextInt();
        scan.close();
        for(int i=1 ; i<n ; i++)
        {
            System.out.print(" " + pent(i));
        }
    }
    static int pent(int n)
    {
        return ((3*n*n)-n)/2;
    }
    
}
