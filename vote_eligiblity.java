import java.util.Scanner;
public class vote_eligiblity {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int age;
        System.out.println("Enter your age:");
        age=scan.nextInt();
        scan.close();
        if(age >= 18)
        System.out.println("Person is eligible for voting");
        else
        System.out.println("Person is not eligible for voting");

    }
    
}
