package Assignment3;
public class Assignment1 {
    public static void main(String[] args) {
        String str="1334";
        System.out.println(sum(str));
    }
    static int sum(String str){
        if(str.length()==0)
            return 0;
    return Integer.parseInt(str.substring(0,1))+sum(str.substring(1));
    }
}
