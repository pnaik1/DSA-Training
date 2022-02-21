import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int[] a = new int[]{5, 3, 4, 1, 2};
        Selection(a);
        System.out.println(Arrays.toString(a));
    }

    static void Selection(int a[]) {
        int temp;
        for (int i = 0; i < a.length; i++) {
            int m = max(a, a.length - i - 1);
           int l=a.length-i-1;
           if(a[m]>a[l]){
               temp=a[l];
               a[l]=a[m];
               a[m]=temp;
           }
        }
    }

    static int max(int a[], int n) {
        int max=0;
        for (int i = 0; i < n; i++) {
            if(a[i]>a[max])
                max=i;
        }
        return max;
    }
}