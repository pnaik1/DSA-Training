package Assignment3;

public class Assignment2 {
    public static void main(String[] args) {
        String str = "1234";
        System.out.println(stringtoint(str));
    }
    static int stringtoint(String Str) {
        if (Str.length() == 1)
            return (Str.charAt(0)-'0');
          int x=Str.charAt(0)-'0';
        return (int)(x*Math.pow(10,Str.length()-1)+stringtoint(Str.substring(1)));
    }
}