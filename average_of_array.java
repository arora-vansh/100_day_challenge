import java.util.Scanner;
public class average_of_array {
    public static void main(String[] args){
        try (Scanner scan = new Scanner(System.in)){
        int n,i,sum=0;
        float avg;
        int[] a = new int[100];
        System.out.print("Enter the number of terms that is to be entered in the array:");
        n = scan.nextInt();
        System.out.println("Enter the values of the array:");
        for(i=0 ; i<n ; i++)
        {
            a[i]=scan.nextInt();
        }
        scan.close();
        for(i=0 ; i<n ; i++)
        {
            sum = sum + a[i];
        }
        avg = sum / n;
        System.out.println("The average is " + avg);
    }
}
}
