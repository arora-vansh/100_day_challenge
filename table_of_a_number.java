import java.util.Scanner;
public class table_of_a_number {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int i,num,s;
        System.out.print("Enter the number whose table is required:");
        num = scan.nextInt();
        scan.close();
        for(i=1 ; i<=10 ; i++)
        {
            s = num * i;
            System.out.println(s);
        } 
    }
    
}
