import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int res = 0;
        int temp = num;
        while (num != 0) {
            res = res * 10 + num % 10;
            num = num / 10;
        }
        if (temp == res)
            System.out.println("the number is a palindrome");
        else
            System.out.println("the number is not a palindrome");
    }
}


