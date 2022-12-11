/* Aim: Demonstrating creation of java classes, objects, constructors, declaration and
initialization of variables.
Program: Create a Java class called Student with the following details as variables within it.
USN
Name
Branch
Phone
Write a Java program to create n Student objects and print the USN, Name, Branch, and
Phone of these objects with suitable headings.
 */
import java.util.Scanner;
public class Details {
    String name,usn,branch;
    long phone;
     Details(String nm,String us,String br,long ph)
    {
        name=nm;
        usn=us;
        branch=br;
        phone=ph;
    }
    void displayStudent()
    {
        System.out.println("**********");
        System.out.println("NAME:"+name);
        System.out.println("USN:"+usn);
        System.out.println("BRANCH:"+branch);
        System.out.println("PHONE NUMBER:"+phone);
        System.out.println("**********");
    }
    public static void main(String[] args)
    {
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter the number of students");
        int n=ip.nextInt();
        String na,u,b;
        long p;
        Details st[]=new Details[n];
        System.out.println("Enter the student details:");
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the name:");  
            na=ip.next();
            System.out.println("Enter the USN:");  
            u=ip.next();
            System.out.println("Enter the Branch:");  
            b=ip.next();
            System.out.println("Enter the phone number:");  
            p=ip.nextLong();
            st[i]=new Details(na,u,b,p);
        }
        System.out.println("\nStudent details:");
        for(int i=0;i<n;i++)
        {
            System.out.println("Student "+(i+1)+":");
            st[i].displayStudent();
        }

    }
}
