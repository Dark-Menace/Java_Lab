/* Write a JAVA program that prints all real solutions to the quadratic equation ax2+bx+c=0. Read a,b,c and use the quadratic formula
Aim: Introduce the JAVA fundamentals,datatypes,operators in JAVA
 */
import java.util.Scanner;
public class Quadratic
{
    public static void main(String args[])
    {
        int a,b,c;
        double root1,root2;
        char ch='y';
        Scanner ip=new Scanner(System.in);
        while(ch=='y'||ch=='Y')
        {
            System.out.println("Enter the coefficients of the quadratic equation:");
            a=ip.nextInt();
            b=ip.nextInt();
            c=ip.nextInt();
            double d=(Math.pow(b,2)-(4*a*c));
            System.out.println("The determinent is "+d);
            if (d>0)
            {
                root1=(-b+Math.sqrt(d))/(2*a);
                root2=(-b-Math.sqrt(d))/(2*a);
                System.out.println("The roots are real and distinct.");
                System.out.format("The roots are:root 1= %.2f and root 2= %.2f\n",root1,root2);
            }

            else if (d==0)
            {
                root1=(-b)/(2*a);
                System.out.println("The roots are real and equal.");
                System.out.format("The roots are:root 1= %.2f and root 2= %.2f\n",root1,root1);
            }
            
            else
            {
                double real=(-b)/(2*a);
                double img=(Math.sqrt(-d))/(2*a);
                System.out.println("The roots are imaginary.");
                System.out.format("The roots are:root 1= %.2f+%.2fi and root 2= %.2f-%.2fi\n",real,img,real,img);
            }
            System.out.println("Do you wish to continue: Y/N");
            ch=ip.next().charAt(0);
        }
    }
}