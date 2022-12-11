/* Aim: Discuss the various Decision-making statements, loop constructs in java
Program:''
B.Write a program for Arithmetic calculator using switch case menu
*/
import java.util.Scanner;
public class Calci 
{
    public static void  main(String[] args)
    {
        char op,ch='y';
        Scanner ip=new Scanner(System.in);
        while(ch=='y'||ch=='Y')
        {
            System.out.println("Enter the operator:");
            op=ip.next().charAt(0);
            System.out.println("Enter operand 1:");
            double a=ip.nextDouble();
            System.out.println("Enter operand 2:");
            double b=ip.nextDouble();
            switch(op)
            {
                case '+':
                System.out.format("\nResult:%.2f + %.2f = %.2f",a,b,(a+b));
                break;
                case '-':
                System.out.format("\nResult:%.2f + %.2f = %.2f",a,b,(a-b));
                break;
                case '*':
                System.out.format("\nResult:%.2f + %.2f = %.2f",a,b,(a*b));
                break;
                case '/':
                if(b!=0)
                System.out.format("\nResult:%.2f + %.2f = %.2f",a,b,(a/b));
                else
                System.out.println("Division by zero is invalid.");
                break;
                default:
                System.out.println("Invalid operator");
            }
            System.out.println("\nDo you wish to continue:Y/N");
            ch=ip.next().charAt(0);  
        }
    }
}
