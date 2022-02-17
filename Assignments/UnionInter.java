import java.util.Scanner;
import java.lang.Math;
public class Unioninter{
    public static void main(String[] args)
    {   int a[]={1,2,3,4};
    int b[]={4,5,6,7};
    int n=a.length;
    int m=a.length;
    System.out.println("the union of the two sorted arrays are");
Union(a,n,b,m);
System.out.println("the Intersection of the two sorted arrays are");
    Intersection(a,n,b,m);


    }


    public static void Union(int a[],int n ,int b[], int m)
    {
        int i=0,j=0;
   while(i<n&&j<m)
    {
        if(a[i]<b[j])
        System.out.print(" "+a[i++]);
        else if(b[j]<a[i])
        System.out.print(" "+b[j++]);
        else
        {

        
  System.out.print(" "+b[j]);
  i++;
  j++;
    }

    }
    System.out.println();
    }
    public static void Intersection(int a[],int n ,int b[], int m)
    {
        int i=0,j=0;
   while(i<n&&j<m)
    {
        if(a[i]<b[j])
        i++;
        else if(b[j]<a[i])
        j++;
        else
        {

        
  System.out.print(" "+b[j]);
  i++;
  j++;
    }

    }
    System.out.println();
    }


}