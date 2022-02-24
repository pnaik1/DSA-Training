package Assignment3;

import java.util.TreeSet;

public class Assignmnent6 {
    public static void main(String[] args) {
        String Str = "abc";
        String p = "";
        TreeSet<String> list = new TreeSet<>();
        permutation(p, Str, list);
        System.out.println(list);
    }

    static void permutation(String p, String up, TreeSet list) {
        if (up.isEmpty()) {
            list.add(p);
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            permutation(f + ch + s, up.substring(1), list);
        }
    }
}
