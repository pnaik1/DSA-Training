import java.util.Scanner;
public class Factor {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = 1;
        System.out.println("the factors of a number are");
        while (i <= num) {
            if (num % i == 0)
                System.out.print(i + " ");
            i++;
        }
    }
}