import java.util.Scanner;
import java.lang.Math;
import java.io.*;
import java.util.*;
public class SelectionSort{
    public static void main(String[] args)
    {   int a[]={3,4,1,2,8,5};
    int n=a.length;
    
    System.out.println("The array before sorting is"+Arrays.toString(a));
    selectionSort(a,n);
System.out.println("The array after Sorting is "+Arrays.toString(a));
    }

public static void selectionSort(int a[],int n)
{int max,temp,i,j;
  for(i=n-1;i>=0;i--)
  {  max=i;
      for(j=0;j<i;j++)
          if(a[j]>a[max])
          max=j;

temp=a[max];
a[max]=a[j];
a[j]=temp;

      }
  }


}
