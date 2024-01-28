import java.util.*;
public class Swapping
{
    public static void main(String [] args)
    {
        int a=10, b=20;
        int t;
        System.out.println("Before Swapping a & b :"+a+ " " +b);
        // System.out.println("a:"+a);
        // System.out.println("b:"+b);
        t=a;
        a=b;
        b=t;
        System.out.println("After Swapping a & b :"+a+ " " +b);
        // System.out.println("a:"+a);
        // System.out.println("b:"+b);
    }
}