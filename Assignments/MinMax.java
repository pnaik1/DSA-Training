import java.util.Scanner;
import java.lang.Math;
public class MinMax{
    public static void main(String[] args)
    {   int a[]={1,4,5,7,2,8,0};
    int min=a[0];
    int max=a[0];
 for( int i=0;i<a.length;i++){

     if(a[i]<min)
     min=a[i];
     else
     max=a[i];

 }
 System.out.println("the maximum and Minimum element are "+max+" and "+min);
    }
}
