import java.util.Scanner;
import java.lang.Math;
public class Missing{
    public static void main(String[] args)
    {   int ar[]={1,2,3,5,6};
int m=ar.length;
    int n=(m+1)*(m+2)/2;
    for(int i=0;i<ar.length;i++)
    {
        n-=ar[i];
    }
System.out.println("The Missing number is "+ n);
    }
}