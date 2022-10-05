import java.util.Scanner;

public class remove_all_occurance_of_string {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		String s;
		char c;
		
		System.out.println("Enter the String:");
		s = scan.nextLine();
		
		System.out.println("Enter the character you want to delete =  ");
		c = scan.next().charAt(0);
        scan.close();
		
		String a = s.replace(c, Character.MIN_VALUE); 
		
		System.out.println("\nThe Final String after Deleting " + c + " Characters = " + a);
	}
}