import java.util.*;
import java.io.*;
public class Task {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true) {
        System.out.println("Enter type of the input : Integer or String or exit ");

       String in;
        in=sc.next();
        switch (in) {
                case "Integer":
                {System.out.println("1.Reverse the number");
                    System.out.println("2.Check if palindrome or not");
                    System.out.println("3.Armstrong number or not");
                    int i = sc.nextInt();
                    System.out.println("Enter the number");
                    int n=sc.nextInt();
                    if (i == 1)
                        System.out.println(reverse(n));
                    else if (i == 2)
                        palindrome(n);
                    else if (i == 3)
                       armstrong(n);
                    break;}
                case "String":{
                    System.out.println("1.Subsequence of string");
                    System.out.println("2.Permutation");
                    System.out.println("3.Print all possible partitions");
                    int j = sc.nextInt();
                    System.out.println("Enter the string");
                    String str=sc.next();
                    if (j == 1)
                        subsequence("",str);
                    else if (j == 2)
                        permutation("",str);
                    else if (j == 3)
                    {
                      partitions("",str);}
                    break;}
            case "exit" : return;
            }
        }
    }
    static int reverse(int n)
    {  int rev=0,remainder;
       while(n!=0)
       {
           rev= (rev*10)+(n%10);
           n/=10;
       }
        return rev;
    }
    static void palindrome(int n)
    {
          int m =reverse(n);
          if(m==n)
              System.out.println("the number is a Palindrome");
          else
              System.out.println("the number is not a palindrome");
    }
    static void armstrong(int n)
    {
        int count =0 ,m=n,temp=0,arm=0;
        while(m!=0)
        {
            count++;
            m=m/10;
        }
        m=n;
         while(m!=0)
         {
             temp=m%10;
             arm+=Math.pow(temp,count);
             m=m/10;
         }
         if(n==arm)
             System.out.println("The number is the armstrong");
         else
             System.out.println("The number is not a armstrong number");
    }
    static void subsequence(String p,String str)
   {
       if(str.isEmpty()) {
           System.out.println(p);
           return;
       }
       char ch=str.charAt(0);
       subsequence(p,str.substring(1));
       subsequence(p+ch,str.substring(1));
    }
    static void permutation(String p,String str){
     if(str.isEmpty()) {
         System.out.println(p);
         return;
     }
     char ch=str.charAt(0);
     for(int i=0;i<=p.length();i++)
     {
         String f=p.substring(0,i);
         String s=p.substring(i,p.length());
         permutation(f+ch+s,str.substring(1));
     }



    }
    static void partitions(String p,String str) {
     ArrayList <String> cur=new ArrayList<>();
        if(str.isEmpty()){
            System.out.println(p);
        }
        for(int i=0;i<str.length();i++)
        {
            String prefix=str.substring(0,i+1);
            String rem=str.substring(i+1);
            if(isPalindrome(prefix))
            {
      partitions(p+"["+prefix+"]", rem);
            }
        }
   }
   static boolean isPalindrome(String str)
   {
       StringBuilder sb=new StringBuilder(str);
       sb.reverse();
       String rev=sb.toString();
       if(str.equals(rev))
           return true;
       else
           return false;
   }

}
