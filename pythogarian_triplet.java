import java.util.Scanner;
public class pythogarian_triplet {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a,b,c;
        System.out.print("Enter the value of a,b,c:");
        a=scan.nextInt();
        b=scan.nextInt();
        c=scan.nextInt();
        scan.close();
        if((a*a)+(b*b)==(c*c))
        System.out.print("It is a pythogarian triplet");
        else
        System.out.print("It is not a pythogarian triplet");
    }
    
}
