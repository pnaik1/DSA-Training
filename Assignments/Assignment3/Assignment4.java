package Assignment3;

public class Assignment4 {
    public static void main(String[] args) {
        String str = "adcda";
        System.out.println(palindrome(str));
    }
    static boolean palindrome(String str) {
        int i = 0;
        int j = str.length() - 1;
        boolean res = true;
        while (i <= j) {
            if (str.charAt(i) != str.charAt(j)) {
                res = false;
                break;
            }
            i++;
            j--;
        }
        return res;
    }
}
