import java.util.*;
public class BubbleSortRec {
    public static void main(String[] args) {
        int[] a=new int[]{2,1,4,3,};
        BubbleSort(a,a.length,0);
        System.out.println(Arrays.toString(a));
    }
    static void BubbleSort(int a[],int row, int col) {
        if (row == 0)
            return;
        if (col < row) {
            if(a[col]>a[col+1]) {
                int temp=a[col];
                a[col]=a[col+1];
                a[col+1]=temp;
                BubbleSort(a,row,col+1);
        }else {
                BubbleSort(a,row-1,0);
        }
    }
}
    }
