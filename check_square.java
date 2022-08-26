import java.util.Scanner;
public class check_square {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int l,b;
        System.out.println("Enter length:");
        l=scan.nextInt();
        System.out.println("Enter breadth");
        b=scan.nextInt();
        scan.close();
        if(l == b)
        System.out.println("The shape is square");
        else
        System.out.println("The shape is not square");
        
    }
    
}

