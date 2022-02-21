import java.util.*;
public class BubbleSort {
    public static void main(String[] args) {
        int[] a=new int[]{1,3,5,4,2};
        boolean flag=false;
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length-i-1;j++)
            {
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    flag=true;
                }
            }
            if(flag==false)
                break;
        }
        System.out.println(Arrays.toString(a));
    }
}
