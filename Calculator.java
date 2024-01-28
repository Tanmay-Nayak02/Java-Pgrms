import java.util.*;
public class Calculator
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st Number :");
        int n1=sc.nextInt();
        System.out.print("Enter 2nd Number :");
        int n2=sc.nextInt();
        System.out.print("Select the Symbols[+  -  *  /  ]:");
        String sym=sc.next();
        int res;
        
        switch(sym)
        {
            case "+" : res=n1+n2;
                       System.out.println("Addition is : "+res);
                    break;

            case "-" : res=n1-n2;
                       System.out.println("Subtraction is : "+res);
                    break;

            case "*" : res=n1*n2;
                       System.out.println("Multiplication is : "+res);
                    break;

            case "/" : res=n1/n2;
                       System.out.println("Division is : "+res);
                    break;
            
            default :  System.out.println("Invalid Symbol");
        }
    }
}
