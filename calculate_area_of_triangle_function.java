import java.util.Scanner;
public class calculate_area_of_triangle_function {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        float a,b,c;
        System.out.println("Enter first side of the triangle:");
        a = scan.nextFloat();
        System.out.println("Enter second side of the triangle:");
        b = scan.nextFloat();
        System.out.println("Enter third side of the triangle:");
        c = scan.nextFloat();
        scan.close();
        System.out.println("The area of triangle is " + area(a,b,c));
    }
    static float area(float a,float b,float c){
        float s,ar;
        s = (a+b+c)/2;
        ar = (float) Math.sqrt(s*(s-a)*(s-b)*(s-c));
        return ar;
    }
    
}
