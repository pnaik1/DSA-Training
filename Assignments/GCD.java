import java.util.Scanner;
import java.lang.Math;
public class GCD{
    public static void main(String[] args)
    {
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int res=0;
        for(int i=1;i<=num1 && i<=num2;i++)
        {
            if(num1%i==0&&num2%i==0)
            {
                res=i;

            }

        }
        System.out.println("the GCD of the two numbers  " +num1+" and " +num2+" is "+res );
        }
}
