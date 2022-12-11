/* Aim: Discuss the various Decision-making statements, loop constructs in java2

Program:
A. Write a program to check prime number
 
 */
import java.util.Scanner;
public class Prime
{
    public static void main(String[] args)
    {
        int flag=0,n;
        char ch='Y';
        Scanner ip=new Scanner(System.in);
        while(ch=='Y'||ch=='y')
        {
            System.out.println("Enter the number to be checked:");
            n=ip.nextInt();
            if(n<0)
            {
                System.out.println("Invalid entry");
            }
            else if (n==0||n==1)
            {
                System.out.println(n+" is neither a prime nor a composite number.");
                
            }
            else if(n==2||n==3||n==5||n==7)
            {
                System.out.println(n+" is a prime number.");
            }
            else
            {
                for(int i=2;i<=7;i++)
                {
                    if(n%i==0)
                    {
                        flag++;
                    }       
                }
                if(flag>0)
                {
                    System.out.println(n+" is a composite number.");

                }   
                else
                {
                    System.out.println(n+" is a prime number.");
                }
            }
            System.out.println("Do you wish to continue:Y/N");
            ch=ip.next().charAt(0);
            flag=0;
        }     
    }
        
}
