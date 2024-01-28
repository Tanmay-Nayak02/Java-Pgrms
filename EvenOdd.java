import java.util.*;
public class EvenOdd
{
    public static void main(String [] args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number :");
        n=sc.nextInt();
        if(n%2==0)
        {
            System.out.print(n+ " Even Number");
        }
        else
        {
            System.out.print(n+ " Odd Number");
        }
    }
}