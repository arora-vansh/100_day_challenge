import java.util.Scanner;

public class missing_element {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range: ");
        int size = sc.nextInt();
        System.out.println("Enter the element in arrays: ");
        int[] arr = new int[size];

        for(int i =0;i<size;i++){
            arr[i]= sc.nextInt();
        }
        int sum = 0;
        for(int i =0;i<size;i++){
            sum = sum + arr[i];
        }
        int sum1 = 0;
        for(int i =1;i<=size+1;i++){
            sum1 = sum1 + i;
        }
        System.out.println("The missing element is: "+(sum1-sum));
        sc.close();
    }

    }