public class Pattern {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int a){
        if(a==0)
            return ;
        for(int i=0;i<a;i++)
            System.out.print("*");
        System.out.println();
         pattern(a-1);
    }
}
