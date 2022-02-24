package Assignment3;
public class Assignment3 {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "cba";
        System.out.println(reverse(str1, str2));
    }
    static boolean reverse(String str1, String str2) {
        boolean res=true;
        if (str1.length() != str2.length())
            return false;
        int i = 0;
        int j = str2.length() - 1;
        while (i<=str1.length()&&j>=0){
           if(str1.charAt(i)!=str2.charAt(j)) {
               res = false;
               break;
           }
           i++;
           j--;
        }
        return res;
    }
}