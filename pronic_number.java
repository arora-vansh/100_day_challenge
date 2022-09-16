import java.util.Scanner;
public class pronic_number {
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n,i,count=0;
    System.out.println("Enter the number:");
    n = scan.nextInt();
    scan.close();
    for(i=0 ; i<n ; i++)
    if(i*(i-1) == n)
    {
    count = count+1;
    break;
}
    if(count == 1)
    System.out.println("The given number is pronic number");
    else
    System.out.println("The given number is not pronic number.");
}
}