import java.util.Scanner;
import java.lang.Math;
import java.util.*;
import java.io.*;
public class Duplicate{
    public static void main(String[] args)
    {   int a[]={1,2,3,1,2,7,5,4};
    int n=a.length;
    System.out.println("The Duplicates element in array");
    for(int i=0;i<n;i++)
    {
        for(int j=i+1;j<n;j++)
        {
            if(a[i]==a[j])
            System.out.println(a[j]);

        }
    }
    }
}