import java.util.Scanner;
import java.lang.Math;
public class Prime {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int flag = 0;
        if(num<=1)
            return;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                flag = 1;
        }
        if (flag == 1)
            System.out.println("the number is not a prime number");
        else
            System.out.println("The number is a prime number");
    }
}