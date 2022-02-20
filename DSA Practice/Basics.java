import java.util.Scanner;
public class Basics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(sc);
        System.out.println("Hello world");
        Integer s = 65;
        int num = (int) (45.908);
        System.out.println("The number is " + s);
        System.out.println("The number is " + num);
        String sm = "hello";
        System.out.println(sm);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        // How to input the character through keyboard
        // while loop
        while (num < 50) {
            System.out.println("Execute the loop");
            num++;
        }
// if condition
        if (num1 > num2) {
            System.out.println("num1 is greater than num2");
        } else {
            System.out.println("num2 is greater than num1");
        }
// For loop
        for (int i = 0; i < num1; i++) {
            System.out.println("The number is" + i);
        }
        Sum su = new Sum();
        su.sum(num1, num2);
    }
}
//Sum of Two number
class Sum {
    int sum(int a, int b) {
        int sum = a + b;
        System.out.println("The sum Of the number" + sum);
        return 0;
    }
}


    


