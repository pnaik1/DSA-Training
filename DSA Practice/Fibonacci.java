import java.util.Scanner;
public class Fibonacci{
    public static void main(String[] args)
    {  
      int first=0,second=1;
      System.out.println("Enter the count");
Scanner n=new Scanner(System.in);
      int num=n.nextInt();
      for(int i=1;i<=num;i++)
      {
        System.out.print(first+" ");

int sumof=first+second;
first=second;
second=sumof;



             }
      
      


    }
    }
