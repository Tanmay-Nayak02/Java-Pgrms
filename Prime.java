import java.util.*;
public class Prime
{
    public static void main(String [] args)
    {
        int i,n=8,flag=0;
        // Scanner sc=new Scanner(System.in);
        // System.out.print("Enter the Number :");
        // n=sc.nextInt();
        for(i=2;i<=n-1;i++)
        {
            if(n%i==0)
            {
                flag+=1;
            }
        }
        if(flag==0)
        {
            System.out.println("Prime Number");
        }
        else
        {
            System.out.println("Not a prime Number");
        }
    }
}