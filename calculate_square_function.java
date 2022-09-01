import java.util.Scanner;
public class calculate_square_function {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num;
        System.out.println("Enter the number: ");
        num = scan.nextInt();
        scan.close();
        System.out.println("The square of number is " + square(num));
    }
    static int square(int num){
        return (num*num);
    } 
    
}
