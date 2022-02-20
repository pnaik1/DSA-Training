import java.util.Scanner;
import java.lang.Math;

public class Max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of array");
        int n = sc.nextInt();
        System.out.println("Enter the array element");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > arr[max])
                max = i;
        }
        System.out.println("The maximum number is present at index " + max);
    }
}