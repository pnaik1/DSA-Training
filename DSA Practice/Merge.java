import java.util.Arrays;
public class Merge {
    public static void main(String[] args) {
        int[] a = new int[]{5, 3, 4, 1, 2};
        int ans[]=Merge(a);
        System.out.println(Arrays.toString(ans));
    }

    static int[] Merge(int a[]) {
        if (a.length==1)
            return a;
        else {
            int mid = (a.length) / 2;
            int[] left = Merge(Arrays.copyOfRange(a,0, mid));
            int[] right = Merge(Arrays.copyOfRange(a, mid,a.length));
            return MrgeSort(left, right);
        }
    }
    static int[] MrgeSort(int[] left, int[] right) {
        int k = 0, i = 0, j = 0;
        int mix[]=new int[left.length+right.length];
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                mix[k++] = left[i];
                i++;
            } else {
                mix[k++] = right[j];
                j++;
            }
        }
        while (i < left.length) {
            mix[k++] = left[i++];
        }
            while (j < right.length) {
                mix[k++] = right[j++];
            }

         return mix;
    }
}