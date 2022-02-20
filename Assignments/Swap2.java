public class Swap2 {
    public static void main(String[] args) {
        int a = 2, b = 5, temp;
        System.out.println("The numbers before swapping are " + a + " " + b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("The numbers after swapping are " + a + " " + b);
    }
}