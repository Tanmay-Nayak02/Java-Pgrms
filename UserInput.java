import java.util.*;
public class UserInput
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Name :");
        String name=sc.next();
        System.out.print("Enter the Age :");
        int age=sc.nextInt();
        System.out.print("Enter the Gender :");
        char gender=sc.next().charAt(0);
        System.out.print("Enter the Phone Number :");
        long phn=sc.nextLong();

        System.out.println("------------------------------");
        System.out.println("Name :"+name);
        System.out.println("Age :"+age);
        System.out.println("Gender :"+gender);
        System.out.println("Phone :"+phn);
        System.out.println("------------------------------");
    }
}