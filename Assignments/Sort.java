import java.util.Scanner;
import java.lang.Math;
import java.io.*;
import java.util.*;
public class Sort{
    public static void main(String[] args)
    {   int a[]={1,0,0,2,1,1,0,0,2,2};
    int n=a.length;
    int p=0,q=0,r=0;
    for(int i=0;i<n;i++)
    {
        if(a[i]==0)
        p++;
        if(a[i]==1)
        q++;
               

    }
    for(int i=0;i<p;i++)
    a[i]=0;
    for(int i=p;i<p+q;i++)
    a[i]=1;
    for(int i=p+q;i<n;i++)
    a[i]=2;
    System.out.println(Arrays.toString(a));
    }
}
