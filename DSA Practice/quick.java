import java.util.Arrays;
public class quick {
    public static void main(String[] args) {
   int a[]=new int[]{5,4,3,2,1};
   System.out.println(Arrays.toString(a));
   quick(a,0,a.length-1);
   System.out.println(Arrays.toString(a));
    }
    static void quick(int a[],int first,int last){
        if(first>=last)
            return;
        int s=first;
        int e=last;
            int m = s+(e-s) / 2;
            int pivot = a[m];
            while (s <= e) {
                while (a[s] < pivot) {
                    s++;
                }
                while (a[e] >pivot) {
                    e--;
                }
                if (s <= e) {
                    int temp = a[s];
                    a[s] = a[e];
                    a[e] = temp;
                    s++;
                    e--;
                }
            }
            quick(a,first,e);
            quick(a,s,last);
    }
}
