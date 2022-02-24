package Assignment3;
public class Assignment5 {
    public static void main(String[] args) {
        String str="abexexdexed";
        System.out.println(removex(str));
    }
    static String removex(String Str){
        String p="";
       if(Str.length()==0)
           return "";
       if(Str.charAt(0)!='x')
            p+=Str.charAt(0);
          p+= removex(Str.substring(1));
       if(Str.charAt(0)=='x')
           p+=Str.charAt(0);
        return p;
    }
}
