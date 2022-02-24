package Assignment3;
import java.util.LinkedHashSet;
import java.util.TreeSet;
public class UniqueCharacter {
    public static void main(String[] args) {
        String str="aaabcd";
        LinkedHashSet<String> list=new LinkedHashSet<>();
        unique(str,list);
        System.out.println(list);
    }
    static void unique(String Str,LinkedHashSet list){
        if(Str.isEmpty())
            return;
        list.add(Str.charAt(0));
        unique(Str.substring(1),list);
    }
}
