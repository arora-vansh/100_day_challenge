import java.util.Scanner;
public class convert_celcius_to_fahrenheit {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        float c,f;
        System.out.print("Enter the temperature in celcius:");
        c = scan.nextInt();
        scan.close();
        f = ((c * 9)/5) + 32;
        System.out.println("Temperature in fahrenhiet is " + f);
    }
    
}
