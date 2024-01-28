import java.util.*;
public class Largest3U
{
    public static void main(String [] args)
    {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st Number :");
        a=sc.nextInt();
        System.out.print("Enter 2nd Number :");
        b=sc.nextInt();
        System.out.print("Enter 3rd Number :");
        c=sc.nextInt();

        if(a>b && a>c)
        {
            System.out.print(a+" is greater ");
        }
        else if(b>a && b>c)
        {
             System.out.print("b is greater ");
        }
        else
        {
            System.out.print("c is greater ");
        }
    }
}