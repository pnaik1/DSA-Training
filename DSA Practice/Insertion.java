import java.util.*;
public class Insertion {
    public static void main(String[] args) {
        int[] a=new int[]{5,3,4,1,2};
        Insertion(a);
        System.out.println(Arrays.toString(a));
    }
    static void Insertion(int a[]){
        int temp;
        for(int i=1;i<a.length;i++){
            for(int j=i;j>0;j--)
                if(a[j]<a[j-1]) {
                    temp = a[j];
                    a[j] = a[j-1];
                    a[j-1] = temp;
                }else {
                    break;
            }
        }
    }
}
