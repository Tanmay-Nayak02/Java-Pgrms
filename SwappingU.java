import java.util.*;
public class SwappingU
{
    public static void main(String [] args)
    {
        int n1,n2,t;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st Number :");
        n1=sc.nextInt();
        System.out.print("Enter 2nd Number :");
        n2=sc.nextInt();
        System.out.println("Before Swapping a & b :"+n1+ " " +n2);
        // System.out.println("a:"+a);
        // System.out.println("b:"+b);
        t=n1;
        n1=n2;
        n2=t;
        System.out.println("After Swapping a & b :"+n1+ " " +n2);
        // System.out.println("a:"+a);
        // System.out.println("b:"+b);
    }
}